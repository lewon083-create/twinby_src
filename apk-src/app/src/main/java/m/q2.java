package m;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends u2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28340a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f28341b;

    public q2(EditText editText) {
        this.f28341b = new WeakReference(editText);
    }

    @Override // u2.f
    public void a() {
        switch (this.f28340a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f28341b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // u2.f
    public final void b() {
        switch (this.f28340a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f28341b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
            default:
                w2.h.a((EditText) this.f28341b.get(), 1);
                break;
        }
    }

    public q2(SwitchCompat switchCompat) {
        this.f28341b = new WeakReference(switchCompat);
    }
}
