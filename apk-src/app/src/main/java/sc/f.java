package sc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import xc.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f32894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f32896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xc.c f32897d;

    public f(Context context, n nVar, c cVar) {
        String strEncodeToString;
        this.f32895b = context.getPackageName();
        this.f32894a = nVar;
        this.f32896c = cVar;
        n nVar2 = xc.e.f36073a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                            }
                        }
                        this.f32897d = new xc.c(context, nVar, g.f32898a);
                        return;
                    }
                }
                n nVar3 = xc.e.f36073a;
                Object[] objArr = new Object[0];
                nVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", n.b(nVar3.f36081a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        nVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", n.b(nVar.f36081a, "Phonesky is not installed.", objArr2));
        }
        this.f32897d = null;
    }

    public static Bundle a(f fVar, byte[] bArr, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", fVar.f32895b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList<xc.j> arrayList = new ArrayList();
        arrayList.add(new xc.j(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (xc.j jVar : arrayList) {
            Bundle bundle2 = new Bundle();
            jVar.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", jVar.f36078a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
