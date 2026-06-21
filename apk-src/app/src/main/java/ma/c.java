package ma;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Dialog f28765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f28766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlertDialog f28767d;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f28766c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f28765b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f28767d == null) {
            Activity activity = getActivity();
            c0.i(activity);
            this.f28767d = new AlertDialog.Builder(activity).create();
        }
        return this.f28767d;
    }
}
