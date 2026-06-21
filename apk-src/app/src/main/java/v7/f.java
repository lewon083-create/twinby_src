package v7;

import a0.b1;
import a0.r1;
import aa.y;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.y71;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.location.LocationResult;
import e1.c0;
import e1.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k6.e0;
import k6.f0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;
import q9.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class f implements k0.c, y71, ii.h, g2.c, oa.j, ii.o, i6.b, k0.a, k4.d, f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f34767c;

    public /* synthetic */ f(int i, Object obj) {
        this.f34766b = i;
        this.f34767c = obj;
    }

    public static String m(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public static void n(Context context, k9.g gVar, da.a aVar) {
        al.a(context);
        if (((Boolean) zl.f13033j.r()).booleanValue()) {
            if (((Boolean) s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new y(context, gVar, aVar, 10));
                return;
            }
        }
        new ut(0, context, gVar.f27259a).p(aVar);
    }

    @Override // k6.f0
    public void a(int i, int i10) {
        ((e0) this.f34767c).notifyItemMoved(i, i10);
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        return k0.j.e(((p.a) this.f34767c).apply(obj));
    }

    @Override // oa.j
    public /* synthetic */ void b(Object obj) {
        ((kb.c) obj).onLocationResult((LocationResult) this.f34767c);
    }

    @Override // g2.c
    public g2.f build() {
        return new g2.f(new b1(((ContentInfo.Builder) this.f34767c).build()));
    }

    @Override // k6.f0
    public void c(int i, int i10) {
        ((e0) this.f34767c).notifyItemRangeInserted(i, i10);
    }

    @Override // g2.c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f34767c).setLinkUri(uri);
    }

    @Override // ii.h
    public void e(Object obj, ii.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b1 b1Var = new b1(sink);
        a1.e eVar = (a1.e) ((a7.l) this.f34767c).f491c;
        eVar.f323c = b1Var;
        eVar.O();
    }

    @Override // i6.b
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // i6.b
    public void g(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f34767c).setResultCode(i);
    }

    @Override // com.google.android.gms.internal.ads.y71
    public ed.d h() {
        aa.l lVar = (aa.l) this.f34767c;
        return (ed.d) lVar.q4(lVar.f623d, null, "BANNER", null, null, 0, null, new Bundle(), null).f2721b.j();
    }

    @Override // g2.c
    public void i(int i) {
        ((ContentInfo.Builder) this.f34767c).setFlags(i);
    }

    @Override // k6.f0
    public void j(int i, int i10) {
        ((e0) this.f34767c).notifyItemRangeRemoved(i, i10);
    }

    @Override // ii.h
    public void k(Object obj) {
        a1.e eVar = (a1.e) ((a7.l) this.f34767c).f491c;
        eVar.f323c = null;
        eVar.O();
    }

    @Override // k6.f0
    public void l(int i, int i10, Object obj) {
        ((e0) this.f34767c).notifyItemRangeChanged(i, i10, obj);
    }

    public int o(int i) {
        WorkDatabase workDatabase;
        int i10;
        synchronized (f.class) {
            try {
                workDatabase = (WorkDatabase) this.f34767c;
                workDatabase.c();
                Long lZ = workDatabase.j().z("next_job_scheduler_id");
                i10 = 0;
                int iIntValue = lZ != null ? lZ.intValue() : 0;
                workDatabase.j().C(new u7.c("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
                if (iIntValue < 0 || iIntValue > i) {
                    ((WorkDatabase) this.f34767c).j().C(new u7.c("next_job_scheduler_id", 1));
                } else {
                    i10 = iIntValue;
                }
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            } finally {
            }
        }
        return i10;
    }

    @Override // k0.c
    public void onFailure(Throwable th2) throws Exception {
        switch (this.f34766b) {
            case 1:
                ((r1) this.f34767c).close();
                break;
            default:
                ((c0) this.f34767c).b("Unable to acquire InputBuffer.", th2, 0);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    @Override // ii.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(ii.n r39, ii.p r40) {
        /*
            Method dump skipped, instruction units count: 1458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.f.onMethodCall(ii.n, ii.p):void");
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        switch (this.f34766b) {
            case 1:
                return;
            default:
                t tVar = (t) obj;
                c0 c0Var = (c0) this.f34767c;
                tVar.b(c0Var.f15933r.i());
                if (tVar.f15993f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                tVar.f15995h = true;
                tVar.c();
                k0.j.a(k0.j.f(tVar.f15991d), new fe.c(12, this), c0Var.i);
                return;
        }
    }

    public void p(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f34767c;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void q(boolean z5) {
        ((WebSettingsBoundaryInterface) this.f34767c).setPaymentRequestEnabled(z5);
    }

    @Override // g2.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f34767c).setExtras(bundle);
    }

    public f(JSONArray jSONArray) {
        this.f34766b = 10;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new d8.m(jSONObjectOptJSONObject));
                }
            }
        }
        this.f34767c = arrayList;
    }

    public f(ClassLoader loader) {
        this.f34766b = 5;
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f34767c = loader;
    }

    public f(Context context) {
        boolean zIsEmpty;
        this.f34766b = 9;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f34767c = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e3) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e3.getMessage());
            }
        }
    }

    public f(int i) {
        this.f34766b = i;
        switch (i) {
            case 26:
                this.f34767c = new l7.i(4);
                break;
        }
    }

    public f(al.a threadFactory) {
        this.f34766b = 8;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f34767c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public f(ClipData clipData, int i) {
        this.f34766b = 14;
        this.f34767c = a2.d.j(clipData, i);
    }

    public f(a7.l wrapper) {
        this.f34766b = 7;
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        this.f34767c = wrapper;
    }
}
