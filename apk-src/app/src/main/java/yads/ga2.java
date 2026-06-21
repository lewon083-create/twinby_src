package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ga2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lw3 f38688a = new lw3();

    public static void a(Context context) {
        lw3 lw3Var = f38688a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (lw3Var.f40709a) {
            return;
        }
        lw3Var.f40709a = true;
        mx3 mx3VarA = mx3.a();
        mx3VarA.f41102c.getClass();
        rv3 rv3Var = new rv3();
        dx3 dx3Var = mx3VarA.f41101b;
        Handler handler = new Handler();
        dx3Var.getClass();
        mx3VarA.f41103d = new yw3(handler, applicationContext, rv3Var, mx3VarA);
        ew3.f38270d.a(applicationContext);
        vv3.a(applicationContext);
        WindowManager windowManager = ow3.f41755a;
        ow3.f41757c = applicationContext.getResources().getDisplayMetrics().density;
        ow3.f41755a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new zw3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        ix3.f39667b.f39668a = applicationContext.getApplicationContext();
        sv3 sv3Var = sv3.f43095f;
        if (!sv3Var.f43098c) {
            sv3Var.f43099d.a(applicationContext);
            uw3 uw3Var = sv3Var.f43099d;
            uw3Var.f43803c = sv3Var;
            uw3Var.b();
            sv3Var.f43100e = sv3Var.f43099d.f43802b;
            sv3Var.f43098c = true;
        }
        ox3.f41764d.f41765a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new nx3(), intentFilter);
    }
}
