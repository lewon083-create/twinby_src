package a4;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import b4.l;
import b4.m;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.measurement.i4;
import j3.c0;
import l6.i;
import m3.z;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l, q6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f422b;

    public /* synthetic */ b(Context context, byte b2) {
        this.f422b = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(j3.o r5) {
        /*
            java.lang.String r0 = r5.f26335n
            r1 = 0
            if (r0 == 0) goto L86
            boolean r0 = j3.c0.k(r0)
            if (r0 != 0) goto Ld
            goto L86
        Ld:
            java.lang.String r5 = r5.f26335n
            java.lang.String r0 = m3.z.f28608a
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r1
        L6b:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                default: goto L6e;
            }
        L6e:
            goto L81
        L6f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L81
            goto L7c
        L76:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L81
        L7c:
            int r5 = s3.a.b(r2, r1, r1, r1)
            return r5
        L81:
            int r5 = s3.a.b(r3, r1, r1, r1)
            return r5
        L86:
            int r5 = s3.a.b(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.b.b(j3.o):int");
    }

    @Override // q6.a
    public q6.b a(b7 b7Var) {
        String str = (String) b7Var.f3659d;
        i iVar = (i) b7Var.f3660e;
        if (iVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f422b;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        b7 b7Var2 = new b7(context, str, iVar, true);
        return new r6.e((Context) b7Var2.f3658c, (String) b7Var2.f3659d, (i) b7Var2.f3660e, b7Var2.f3657b);
    }

    @Override // b4.l
    public m j(o oVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.f422b) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new g8.g(7).j(oVar);
        }
        int iH = c0.h(((j3.o) oVar.f31948c).f26335n);
        m3.b.j("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + z.E(iH));
        b4.c cVar = new b4.c(iH, 0);
        b4.c cVar2 = new b4.c(iH, 1);
        i4 i4Var = new i4();
        i4Var.f13782c = cVar;
        i4Var.f13783d = cVar2;
        i4Var.f13781b = true;
        i4Var.f13781b = true;
        return i4Var.j(oVar);
    }

    public b(Context context, int i) {
        switch (i) {
            case 3:
                pa.c0.i(context);
                Context applicationContext = context.getApplicationContext();
                pa.c0.i(applicationContext);
                this.f422b = applicationContext;
                break;
            default:
                context.getClass();
                this.f422b = context;
                break;
        }
    }
}
