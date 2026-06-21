package qc;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f32101c;

    public /* synthetic */ u(TextInputLayout textInputLayout, int i) {
        this.f32100b = i;
        this.f32101c = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32100b) {
            case 0:
                CheckableImageButton checkableImageButton = this.f32101c.f14676d.f32037h;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                this.f32101c.f14678e.requestLayout();
                break;
        }
    }
}
