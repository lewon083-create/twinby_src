package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13557c;

    public static boolean b(String str) {
        int i;
        String strReplaceAll = str.replaceAll("\\s", "");
        if (!TextUtils.isEmpty(strReplaceAll)) {
            if (strReplaceAll.length() % 2 == 0) {
                int i10 = 0;
                i = 0;
                while (i10 < strReplaceAll.length()) {
                    int i11 = i10 + 1;
                    int i12 = Integer.parseInt(strReplaceAll.substring(i10, i11)) * 2;
                    if (i12 > 9) {
                        i12 -= 9;
                    }
                    i10 += 2;
                    i = i + i12 + Integer.parseInt(strReplaceAll.substring(i11, i10));
                }
            } else {
                int i13 = 0;
                int i14 = 1;
                while (i14 < strReplaceAll.length()) {
                    int i15 = Integer.parseInt(strReplaceAll.substring(i14, i14 + 1)) * 2;
                    if (i15 > 9) {
                        i15 -= 9;
                    }
                    i13 = i13 + i15 + Integer.parseInt(strReplaceAll.substring(i14 - 1, i14));
                    i14 += 2;
                }
                i = i13 + Integer.parseInt(strReplaceAll.substring(i14 - 1, i14));
            }
            if (i % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    public String a(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String str2 = this.f13555a;
        String str3 = this.f13556b;
        String str4 = this.f13557c;
        String string = "";
        String strReplaceAll = str2.replaceAll("\\s", "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strReplaceAll.substring(0, 6));
        sb2.append(strReplaceAll.substring(strReplaceAll.length() - 4, strReplaceAll.length()));
        String string2 = sb2.toString();
        String str5 = str3.substring(2, 4) + str3.substring(0, 2);
        byte[] bytes = (strReplaceAll + "@" + str5 + "@" + str4 + "@" + str).getBytes("ASCII");
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
        SecureRandom secureRandom = new SecureRandom();
        PublicKey publicKeyGeneratePublic = null;
        try {
            publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArBZ1NNjvszen6BNWsgyDUJvDUZDtvR4jKNQtEwW1iW7hqJr0TdD8hgTxw3DfH+Hi/7ZjSNdH5EfChvgVW9wtTxrvUXCOyJndReq7qNMo94lHpoSIVW82dp4rcDB4kU+q+ekh5rj9Oj6EReCTuXr3foLLBVpH0/z1vtgcCfQzsLlGkSTwgLqASTUsuzfI8viVUbxE1a+600hN0uBh/CYKoMnCp/EhxV8g7eUmNsWjZyiUrV8AA/5DgZUCB+jqGQT/Dhc8e21tAkQ3qan/jQ5i/QYocA/4jW3WQAldMLj0PA36kINEbuDKq8qRh25v+k4qyjb7Xp4W2DywmNtG3Q20MQIDAQAB".getBytes("utf-8"), 0)));
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
        } catch (NoSuchAlgorithmException e7) {
            e7.printStackTrace();
        } catch (InvalidKeySpecException e10) {
            e10.printStackTrace();
        }
        cipher.init(1, publicKeyGeneratePublic, secureRandom);
        for (String str6 : ("02" + string2 + str5 + "04" + Base64.encodeToString(cipher.doFinal(bytes), 0)).split("\n")) {
            StringBuilder sbJ = pe.a.j(string);
            sbJ.append(str6);
            string = sbJ.toString();
        }
        return string;
    }
}
