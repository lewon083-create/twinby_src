package bc;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2051b;

    public /* synthetic */ e(int i, Object obj) {
        this.f2050a = i;
        this.f2051b = obj;
    }

    @Override // g2.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2050a) {
            case 2:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f2051b).f14636e);
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // g2.b
    public final void onInitializeAccessibilityNodeInfo(View view, h2.f fVar) {
        int i;
        int i10 = this.f2050a;
        Object obj = this.f2051b;
        switch (i10) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, fVar);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i11 = MaterialButtonToggleGroup.f14527l;
                if (view instanceof MaterialButton) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                        if (materialButtonToggleGroup.getChildAt(i13) == view) {
                            i = i12;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.c(i13)) {
                                i12++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                fVar.f20360a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f14524p));
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, fVar);
                m mVar = (m) obj;
                fVar.j(mVar.f14594g0.getVisibility() == 0 ? mVar.M().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : mVar.M().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, fVar);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                boolean z5 = checkableImageButton.f14637f;
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f20360a;
                accessibilityNodeInfo.setCheckable(z5);
                accessibilityNodeInfo.setChecked(checkableImageButton.f14636e);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, fVar);
                fVar.f20360a.setCheckable(((NavigationMenuItemView) obj).f14641y);
                break;
        }
    }
}
