package xi;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import io.sentry.rrweb.RRWebVideoEvent;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f36233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36234c;

    public h(i iVar, Activity activity) {
        this.f36234c = iVar;
        this.f36233b = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f36233b != activity || activity.getApplicationContext() == null) {
            return;
        }
        ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.f36233b == activity) {
            g gVar = (g) this.f36234c.f36236c.f28252d;
            synchronized (gVar.f36232m) {
                try {
                    x7.b bVar = gVar.f36231l;
                    if (bVar == null) {
                        return;
                    }
                    p pVar = (p) bVar.f35977b;
                    ti.m mVar = gVar.f36225e;
                    int i = pVar != null ? 1 : 2;
                    mVar.getClass();
                    int iM = z.m(i);
                    if (iM == 0) {
                        mVar.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "image").apply();
                    } else if (iM == 1) {
                        mVar.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", RRWebVideoEvent.EVENT_TAG).apply();
                    }
                    if (pVar != null) {
                        SharedPreferences.Editor editorEdit = gVar.f36225e.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
                        Double d10 = pVar.f36252a;
                        if (d10 != null) {
                            editorEdit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(d10.doubleValue()));
                        }
                        Double d11 = pVar.f36253b;
                        if (d11 != null) {
                            editorEdit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(d11.doubleValue()));
                        }
                        editorEdit.putInt("flutter_image_picker_image_quality", pVar.f36254c.intValue());
                        editorEdit.apply();
                    }
                    Uri uri = gVar.f36230k;
                    if (uri != null) {
                        gVar.f36225e.f33853a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(androidx.lifecycle.u uVar) {
        onActivityDestroyed(this.f36233b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(androidx.lifecycle.u uVar) {
        onActivityStopped(this.f36233b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(androidx.lifecycle.u uVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(androidx.lifecycle.u uVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(androidx.lifecycle.u uVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(androidx.lifecycle.u uVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
