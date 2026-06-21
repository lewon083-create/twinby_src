package t9;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33590c;

    public /* synthetic */ f(int i, Object obj) {
        this.f33589b = i;
        this.f33590c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33589b) {
            case 0:
                ((i) this.f33590c).b();
                break;
            default:
                z2.p pVar = (z2.p) this.f33590c;
                Dialog dialog = pVar.f45930g0;
                if (dialog != null) {
                    pVar.onCancel(dialog);
                }
                break;
        }
    }
}
