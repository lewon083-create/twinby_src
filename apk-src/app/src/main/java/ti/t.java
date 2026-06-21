package ti;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements x9.c, ya.b, ya.c, ii.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static t f33896c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33897b;

    public /* synthetic */ t(int i) {
        this.f33897b = i;
    }

    public static String f(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType == null || extensionFromMimeType.isEmpty()) {
                return null;
            }
            return "." + i(extensionFromMimeType);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(android.content.Context r13, android.net.Uri r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.t.g(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static File h(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String strReplace = str.split("/")[r4.length - 1];
        for (int i = 0; i < 2; i++) {
            strReplace = strReplace.replace(strArr[i], "_");
        }
        return strReplace;
    }

    @Override // ii.d
    public void a(ByteBuffer byteBuffer, zh.f fVar) {
        ii.y.f21324b.getClass();
        ii.y.a(byteBuffer);
    }

    @Override // ya.b
    public int b(Context context, String str, boolean z5) {
        return ya.d.d(context, str, z5);
    }

    @Override // ya.b
    public int c(Context context, String str) {
        return ya.d.a(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ya.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.j0 d(android.content.Context r3, java.lang.String r4, ya.b r5) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.j0 r0 = new com.google.android.gms.internal.ads.j0
            r0.<init>()
            int r1 = r5.c(r3, r4)
            r0.f6666a = r1
            r1 = 1
            int r3 = r5.b(r3, r4, r1)
            r0.f6667b = r3
            int r4 = r0.f6666a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f6668c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.t.d(android.content.Context, java.lang.String, ya.b):com.google.android.gms.internal.ads.j0");
    }

    public void e(yi.b bVar) {
        switch (this.f33897b) {
            case 9:
                Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + bVar);
                break;
            default:
                Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + bVar);
                break;
        }
    }

    public t(zh.b bVar) {
        this.f33897b = 11;
    }
}
