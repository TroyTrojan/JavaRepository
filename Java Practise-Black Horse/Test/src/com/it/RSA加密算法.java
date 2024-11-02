import java.security.*;
import java.util.Base64;
import javax.crypto.Cipher;

public class RSA加密算法 {

  // 方法：生成RSA密钥对
  public static KeyPair generateRSAKeyPair() throws Exception {
    // 使用RSA算法生成密钥对
    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
    keyPairGenerator.initialize(2048); // 设置密钥长度为2048位
    return keyPairGenerator.generateKeyPair();
  }

  // 方法：使用RSA公钥加密文本
  public static String encryptRSA(String plainText, PublicKey publicKey) throws Exception {
    // 创建RSA Cipher对象
    Cipher cipher = Cipher.getInstance("RSA");
    // 初始化为加密模式
    cipher.init(Cipher.ENCRYPT_MODE, publicKey);
    // 执行加密
    byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
    // 返回加密后的文本（使用Base64编码便于显示）
    return Base64.getEncoder().encodeToString(encryptedBytes);
  }

  // 方法：使用RSA私钥解密文本
  public static String decryptRSA(String encryptedText, PrivateKey privateKey) throws Exception {
    // 创建RSA Cipher对象
    Cipher cipher = Cipher.getInstance("RSA");
    // 初始化为解密模式
    cipher.init(Cipher.DECRYPT_MODE, privateKey);
    // 执行解密
    byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
    byte[] decryptedBytes = cipher.doFinal(decodedBytes);
    // 返回解密后的明文
    return new String(decryptedBytes);
  }

  public static void main(String[] args) throws Exception {
    String text = "使用RSA加密王宇的名字";
    // 生成RSA密钥对
    KeyPair rsaKeyPair = generateRSAKeyPair();
    PublicKey publicKey = rsaKeyPair.getPublic();
    PrivateKey privateKey = rsaKeyPair.getPrivate();
    System.out.println(
        "RSA Public Key: " + Base64.getEncoder().encodeToString(publicKey.getEncoded()));
    System.out.println(
        "RSA Private Key: " + Base64.getEncoder().encodeToString(privateKey.getEncoded()));
    // 加密
    String encryptedText = encryptRSA(text, publicKey);
    System.out.println("Encrypted Text: " + encryptedText);
    // 解密
    String decryptedText = decryptRSA(encryptedText, privateKey);
    System.out.println("Decrypted Text: " + decryptedText);
  }
}
