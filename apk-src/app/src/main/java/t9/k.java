package t9;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f33622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f33624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f33625e;

    public k(l lVar, Context context, String str, boolean z5, boolean z10) {
        this.f33622b = context;
        this.f33623c = str;
        this.f33624d = z5;
        this.f33625e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var = p9.k.C.f31297c;
        Context context = this.f33622b;
        AlertDialog.Builder builderL = g0.l(context);
        builderL.setMessage(this.f33623c);
        if (this.f33624d) {
            builderL.setTitle("Error");
        } else {
            builderL.setTitle("Info");
        }
        if (this.f33625e) {
            builderL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderL.setPositiveButton("Learn More", new d(this, context));
            builderL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderL.create().show();
    }
}
