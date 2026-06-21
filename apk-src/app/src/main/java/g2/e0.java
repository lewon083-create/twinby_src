package g2;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x1 f19852a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f19853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f19854c;

    public e0(View view, q qVar) {
        this.f19853b = view;
        this.f19854c = qVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        x1 x1VarG = x1.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        q qVar = this.f19854c;
        if (i < 30) {
            f0.a(windowInsets, this.f19853b);
            if (x1VarG.equals(this.f19852a)) {
                return qVar.l(view, x1VarG).f();
            }
        }
        this.f19852a = x1VarG;
        x1 x1VarL = qVar.l(view, x1VarG);
        if (i >= 30) {
            return x1VarL.f();
        }
        Field field = n0.f19900a;
        view.requestApplyInsets();
        return x1VarL.f();
    }
}
