package t9;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33558c;

    public /* synthetic */ d(int i, Object obj) {
        this.f33557b = i;
        this.f33558c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33557b) {
            case 0:
                ((AtomicInteger) this.f33558c).set(i);
                break;
            case 1:
                ((i) this.f33558c).b();
                break;
            default:
                g0 g0Var = p9.k.C.f31297c;
                g0.v((Context) this.f33558c, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }

    public d(k kVar, Context context) {
        this.f33557b = 2;
        this.f33558c = context;
    }
}
