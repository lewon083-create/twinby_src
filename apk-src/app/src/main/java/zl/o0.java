package zl;

import android.content.DialogInterface;
import yads.o90;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46620b;

    public /* synthetic */ o0(int i) {
        this.f46620b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f46620b) {
            case 0:
                o90.b(dialogInterface, i);
                break;
            default:
                o90.a(dialogInterface, i);
                break;
        }
    }
}
