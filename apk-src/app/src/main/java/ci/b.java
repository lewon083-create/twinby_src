package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import l6.i;
import m3.z;
import q3.g;
import q3.k;
import q3.m;
import q3.n;
import q3.o;
import q3.r;
import t.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2284e;

    public b(String str, String str2, String str3, String str4, boolean z5) {
        this.f2281b = str == null ? "libapp.so" : str;
        this.f2282c = str2 == null ? "flutter_assets" : str2;
        this.f2284e = str4;
        this.f2283d = str3 == null ? "" : str3;
        this.f2280a = z5;
    }

    public static int h(k kVar, int i) {
        int iHashCode = kVar.f31666b.hashCode() + (kVar.f31665a * 31);
        if (i < 2) {
            long jA = n.a(kVar.f31669e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return kVar.f31669e.hashCode() + (iHashCode * 31);
    }

    public static k k(int i, DataInputStream dataInputStream) throws IOException {
        o oVarA;
        int i10 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j10 = dataInputStream.readLong();
            g gVar = new g();
            gVar.a(Long.valueOf(j10), "exo_len");
            oVarA = o.f31675c.b(gVar);
        } else {
            oVarA = x1.a(dataInputStream);
        }
        return new k(i10, utf, oVarA);
    }

    @Override // q3.m
    public void a(k kVar, boolean z5) {
        this.f2280a = true;
    }

    @Override // q3.m
    public void b(HashMap map) throws Throwable {
        i iVar = (i) this.f2283d;
        DataOutputStream dataOutputStream = null;
        try {
            m3.a aVarK = iVar.k();
            r rVar = (r) this.f2284e;
            if (rVar == null) {
                this.f2284e = new r(aVarK);
            } else {
                rVar.a(aVarK);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((r) this.f2284e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iH = 0;
                for (k kVar : map.values()) {
                    dataOutputStream2.writeInt(kVar.f31665a);
                    dataOutputStream2.writeUTF(kVar.f31666b);
                    x1.b(kVar.f31669e, dataOutputStream2);
                    iH += h(kVar, 2);
                }
                dataOutputStream2.writeInt(iH);
                dataOutputStream2.close();
                ((File) iVar.f27979d).delete();
                String str = z.f28608a;
                this.f2280a = false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                z.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // q3.m
    public boolean c() {
        i iVar = (i) this.f2283d;
        return ((File) iVar.f27978c).exists() || ((File) iVar.f27979d).exists();
    }

    @Override // q3.m
    public void d(HashMap map) throws Throwable {
        if (this.f2280a) {
            b(map);
        }
    }

    @Override // q3.m
    public void delete() {
        i iVar = (i) this.f2283d;
        ((File) iVar.f27978c).delete();
        ((File) iVar.f27979d).delete();
    }

    @Override // q3.m
    public void f(k kVar) {
        this.f2280a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x007e, IOException -> 0x0081, LOOP:0: B:36:0x0093->B:37:0x0095, LOOP_END, TryCatch #4 {IOException -> 0x0081, all -> 0x007e, blocks: (B:13:0x0045, B:18:0x004f, B:24:0x005f, B:25:0x0069, B:26:0x0072, B:33:0x0086, B:34:0x008b, B:35:0x008c, B:37:0x0095, B:38:0x00ab), top: B:61:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    @Override // q3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.b.g(java.util.HashMap, android.util.SparseArray):void");
    }

    public synchronized void i() {
        try {
            if (this.f2280a) {
                return;
            }
            Boolean boolL = l();
            this.f2283d = boolL;
            if (boolL == null) {
                vd.b bVar = new vd.b() { // from class: com.google.firebase.messaging.q
                    @Override // vd.b
                    public final void a(vd.a aVar) {
                        ci.b bVar2 = this.f14865a;
                        if (bVar2.j()) {
                            FirebaseMessaging firebaseMessaging = (FirebaseMessaging) bVar2.f2284e;
                            v7.f fVar = FirebaseMessaging.f14762l;
                            firebaseMessaging.k();
                        }
                    }
                };
                this.f2282c = bVar;
                md.k kVar = (md.k) ((vd.d) this.f2281b);
                kVar.b(kVar.f28858c, bVar);
            }
            this.f2280a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean j() {
        Boolean bool;
        try {
            i();
            bool = (Boolean) this.f2283d;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f2284e).f14765a.k();
    }

    public Boolean l() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        fd.g gVar = ((FirebaseMessaging) this.f2284e).f14765a;
        gVar.a();
        Context context = gVar.f16758a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public b(File file) {
        this.f2281b = null;
        this.f2282c = null;
        this.f2283d = new i(file);
    }

    public b(FirebaseMessaging firebaseMessaging, vd.d dVar) {
        this.f2284e = firebaseMessaging;
        this.f2281b = dVar;
    }

    @Override // q3.m
    public void e(long j10) {
    }
}
