package s9;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.security.NetworkSecurityPolicy;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.r81;
import com.google.android.gms.internal.ads.ul;
import com.google.android.gms.internal.ads.yw;
import com.google.android.gms.internal.ads.zw;
import com.google.android.gms.tasks.Task;
import io.sentry.ProfilingTraceData;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.json.JSONObject;
import pa.c0;
import q9.s;
import t9.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32845d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f32843b = i;
        this.f32844c = obj;
        this.f32845d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, RemoteException -> 0x0056, blocks: (B:21:0x0038, B:23:0x003f, B:28:0x0058, B:30:0x005f, B:41:0x007d, B:43:0x008e, B:45:0x00a0, B:52:0x00e5, B:53:0x0100, B:46:0x00b1, B:48:0x00bf, B:50:0x00d1, B:51:0x00dd, B:32:0x0063, B:35:0x0068, B:38:0x0072, B:40:0x0078), top: B:63:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, RemoteException -> 0x0056, blocks: (B:21:0x0038, B:23:0x003f, B:28:0x0058, B:30:0x005f, B:41:0x007d, B:43:0x008e, B:45:0x00a0, B:52:0x00e5, B:53:0x0100, B:46:0x00b1, B:48:0x00bf, B:50:0x00d1, B:51:0x00dd, B:32:0x0063, B:35:0x0068, B:38:0x0072, B:40:0x0078), top: B:63:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.i.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32843b) {
            case 0:
                ((d) ((zw) this.f32844c).f13133d).f32808c.getWindow().setBackgroundDrawable((BitmapDrawable) this.f32845d);
                return;
            case 1:
                sb.j jVar = (sb.j) this.f32845d;
                try {
                    Task task = (Task) jVar.f32870d.g((Task) this.f32844c);
                    if (task == null) {
                        jVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    j0.b bVar = sb.h.f32860b;
                    task.d(bVar, jVar);
                    task.c(bVar, jVar);
                    task.a(bVar, jVar);
                    return;
                } catch (sb.e e3) {
                    if (!(e3.getCause() instanceof Exception)) {
                        jVar.f32871e.m(e3);
                        return;
                    } else {
                        jVar.f32871e.m((Exception) e3.getCause());
                        return;
                    }
                } catch (Exception e7) {
                    jVar.f32871e.m(e7);
                    return;
                }
            case 2:
                sb.k kVar = (sb.k) this.f32845d;
                synchronized (kVar.f32874d) {
                    try {
                        sb.c cVar = (sb.c) kVar.f32875e;
                        if (cVar != null) {
                            Exception exception = ((Task) this.f32844c).getException();
                            c0.i(exception);
                            cVar.onFailure(exception);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 3:
                sb.k kVar2 = (sb.k) this.f32845d;
                try {
                    Task taskC = ((sb.f) kVar2.f32874d).c(((Task) this.f32844c).getResult());
                    if (taskC == null) {
                        kVar2.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    j0.b bVar2 = sb.h.f32860b;
                    taskC.d(bVar2, kVar2);
                    taskC.c(bVar2, kVar2);
                    taskC.a(bVar2, kVar2);
                    return;
                } catch (CancellationException unused) {
                    kVar2.b();
                    return;
                } catch (sb.e e10) {
                    if (e10.getCause() instanceof Exception) {
                        kVar2.onFailure((Exception) e10.getCause());
                        return;
                    } else {
                        kVar2.onFailure(e10);
                        return;
                    }
                } catch (Exception e11) {
                    kVar2.onFailure(e11);
                    return;
                }
            case 4:
                t9.i iVar = (t9.i) this.f32844c;
                r81 r81Var = (r81) this.f32845d;
                p9.k kVar3 = p9.k.C;
                t9.l lVar = kVar3.f31308o;
                Context context = iVar.f33608a;
                if (lVar.b(context, iVar.f33611d, iVar.f33612e)) {
                    r81Var.execute(new t9.c(iVar, 4));
                    return;
                } else {
                    kVar3.f31308o.c(context, iVar.f33611d, iVar.f33612e);
                    return;
                }
            case 5:
                e0 e0Var = (e0) this.f32844c;
                SharedPreferences sharedPreferences = ((Context) this.f32845d).getSharedPreferences("admob", 0);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                try {
                    synchronized (e0Var.f33564a) {
                        try {
                            e0Var.f33569f = sharedPreferences;
                            e0Var.f33570g = editorEdit;
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            e0Var.f33571h = e0Var.f33569f.getBoolean("use_https", e0Var.f33571h);
                            e0Var.f33583u = e0Var.f33569f.getBoolean("content_url_opted_out", e0Var.f33583u);
                            e0Var.i = e0Var.f33569f.getString("content_url_hashes", e0Var.i);
                            e0Var.f33573k = e0Var.f33569f.getBoolean("gad_idless", e0Var.f33573k);
                            e0Var.f33584v = e0Var.f33569f.getBoolean("content_vertical_opted_out", e0Var.f33584v);
                            e0Var.f33572j = e0Var.f33569f.getString("content_vertical_hashes", e0Var.f33572j);
                            e0Var.f33580r = e0Var.f33569f.getInt(ProfilingTraceData.JsonKeys.VERSION_CODE, e0Var.f33580r);
                            if (((Boolean) ul.f10973g.r()).booleanValue() && s.f31967e.f31970c.f12648j) {
                                e0Var.f33576n = new yw("", 0L);
                            } else {
                                e0Var.f33576n = new yw(e0Var.f33569f.getString("app_settings_json", e0Var.f33576n.f12770e), e0Var.f33569f.getLong("app_settings_last_update_ms", e0Var.f33576n.f12771f));
                            }
                            e0Var.f33577o = e0Var.f33569f.getLong("app_last_background_time_ms", e0Var.f33577o);
                            e0Var.f33579q = e0Var.f33569f.getInt("request_in_session_count", e0Var.f33579q);
                            e0Var.f33578p = e0Var.f33569f.getLong("first_ad_req_time_ms", e0Var.f33578p);
                            e0Var.f33581s = e0Var.f33569f.getStringSet("never_pool_slots", e0Var.f33581s);
                            e0Var.f33585w = e0Var.f33569f.getString("display_cutout", e0Var.f33585w);
                            e0Var.B = e0Var.f33569f.getInt("app_measurement_npa", e0Var.B);
                            e0Var.C = e0Var.f33569f.getInt("sd_app_measure_npa", e0Var.C);
                            e0Var.D = e0Var.f33569f.getLong("sd_app_measure_npa_ts", e0Var.D);
                            e0Var.f33586x = e0Var.f33569f.getString("inspector_info", e0Var.f33586x);
                            e0Var.f33587y = e0Var.f33569f.getBoolean("linked_device", e0Var.f33587y);
                            e0Var.f33588z = e0Var.f33569f.getString("linked_ad_unit", e0Var.f33588z);
                            e0Var.A = e0Var.f33569f.getString("inspector_ui_storage", e0Var.A);
                            e0Var.f33574l = e0Var.f33569f.getString("IABTCF_TCString", e0Var.f33574l);
                            e0Var.f33575m = e0Var.f33569f.getInt("gad_has_consent_for_cookies", e0Var.f33575m);
                            e0Var.E = e0Var.f33569f.getBoolean("is_install_referrer_reported", e0Var.E);
                            try {
                                e0Var.f33582t = new JSONObject(e0Var.f33569f.getString("native_advanced_settings", "{}"));
                            } catch (JSONException e12) {
                                u9.i.i("Could not convert native advanced settings to json object", e12);
                            }
                            e0Var.j();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    p9.k.C.f31302h.d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th3);
                    t9.c0.n("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th3);
                    return;
                }
            case 6:
                a();
                return;
            case 7:
                ((w7.j) this.f32844c).l(((v7.l) this.f32845d).f34784e.getForegroundInfoAsync());
                return;
            default:
                synchronized (((ConstraintTrackingWorker) this.f32845d).f1792h) {
                    if (((ConstraintTrackingWorker) this.f32845d).i) {
                        ((ConstraintTrackingWorker) this.f32845d).f1793j.j(new l7.k());
                    } else {
                        ((ConstraintTrackingWorker) this.f32845d).f1793j.l((ed.d) this.f32844c);
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ i(int i, Object obj, Object obj2, boolean z5) {
        this.f32843b = i;
        this.f32844c = obj2;
        this.f32845d = obj;
    }
}
