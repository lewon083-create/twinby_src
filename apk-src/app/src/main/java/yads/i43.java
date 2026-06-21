package yads;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn f39438a;

    public /* synthetic */ i43() {
        this(new jn());
    }

    public final String a(Context context, String str) {
        hm0 hm0Var;
        byte[] bArrA;
        byte[] bArrDecode;
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA == null || (hm0Var = pt2VarA.X) == null) {
            hm0Var = hm0.f39240c;
        }
        String str2 = hm0Var.f39241a;
        kt1 kt1Var = new kt1(hm0Var.f39242b, str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            bArrDecode = Base64.decode(str2, 0);
        } catch (Throwable unused) {
        }
        if (bArrDecode != null) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[16];
            secureRandom.nextBytes(bArr2);
            secureRandom.nextBytes(bArr);
            bArrA = kt1Var.a(bytes, bArr2, bArr, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
        } else {
            bArrA = null;
        }
        if (bArrA == null) {
            return null;
        }
        this.f39438a.getClass();
        return jn.a(bArrA);
    }

    public i43(jn jnVar) {
        this.f39438a = jnVar;
    }
}
