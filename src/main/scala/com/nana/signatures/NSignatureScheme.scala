package com.nana.signatures

//import com.nana.common.MyTags.{PrivateKey, PublicKey}
import com.nana.common.MyTags.Address
import scorex.crypto.encode.Base58
import scorex.crypto.signatures.{Curve25519, PrivateKey, PublicKey,Signature}


case class PrivateKey25519(privKeyBytes:PrivateKey , publicKeyBytes: PublicKey){
// throws error if passed keys doesnt conform to Curve25519
  require(privKeyBytes.length == Curve25519.KeyLength, s"${privKeyBytes.length} == ${Curve25519.KeyLength}")
  require(publicKeyBytes.length == Curve25519.KeyLength, s"${publicKeyBytes.length} == ${Curve25519.KeyLength}")

  lazy val address:Address = Address @@ Base58.encode(publicKeyBytes)

}


object NSignatureScheme {
  // implement the gen, sign, verify signature scheme

  def generateKeys(random:Array[Byte]): (PrivateKey25519, Address) = {
    val keyPair = Curve25519.createKeyPair(random)
    val secret:PrivateKey25519 = PrivateKey25519(keyPair._1,keyPair._2)
    secret -> secret.address
  }

  def sign(secret: PrivateKey25519, message: Array[Byte]):Signature = Curve25519.sign(secret.privKeyBytes, message)

  def verify(message: Array[Byte], pubKey: PublicKey, proof: Signature): Boolean = Curve25519.verify(proof, message,pubKey)

}


