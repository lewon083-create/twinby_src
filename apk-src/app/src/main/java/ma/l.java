package ma;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class l extends z2.p {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Dialog f28785l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f28786m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public AlertDialog f28787n0;

    @Override // z2.p
    public final Dialog R() {
        Dialog dialog = this.f28785l0;
        if (dialog != null) {
            return dialog;
        }
        this.f45926c0 = false;
        if (this.f28787n0 == null) {
            Context contextL = l();
            c0.i(contextL);
            this.f28787n0 = new AlertDialog.Builder(contextL).create();
        }
        return this.f28787n0;
    }

    @Override // z2.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f28786m0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
