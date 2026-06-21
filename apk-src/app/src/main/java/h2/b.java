package h2;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import g2.n0;
import java.lang.reflect.Field;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f20347a;

    public b(x0 x0Var) {
        this.f20347a = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f20347a.equals(((b) obj).f20347a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20347a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        qc.j jVar = (qc.j) this.f20347a.f29501c;
        AutoCompleteTextView autoCompleteTextView = jVar.f32019h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = jVar.f32055d;
        int i = z5 ? 2 : 1;
        Field field = n0.f19900a;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
