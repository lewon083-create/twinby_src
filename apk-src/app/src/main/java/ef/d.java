package ef;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements io.flutter.plugin.platform.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f16372c;

    public /* synthetic */ d(View view, int i) {
        this.f16371b = i;
        this.f16372c = view;
    }

    @Override // io.flutter.plugin.platform.f
    public final void a() {
        switch (this.f16371b) {
            case 0:
            case 1:
                break;
            default:
                this.f16372c = null;
                break;
        }
    }

    @Override // io.flutter.plugin.platform.f
    public final View getView() {
        switch (this.f16371b) {
        }
        return this.f16372c;
    }

    public d(View view) {
        this.f16371b = 0;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f16372c = view;
    }

    private final void b() {
    }

    private final void c() {
    }
}
