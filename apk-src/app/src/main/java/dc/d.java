package dc;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.twinby.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f15741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f15741a = chip;
    }

    @Override // n2.b
    public final int b(float f10, float f11) {
        Rect rect = Chip.f14538x;
        Chip chip = this.f15741a;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
    }

    @Override // n2.b
    public final void c(List list) {
        f fVar;
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(0);
        Rect rect = Chip.f14538x;
        Chip chip = this.f15741a;
        if (!chip.d() || (fVar = chip.f14541f) == null || !fVar.L || chip.i == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // n2.b
    public final boolean e(int i, int i10, Bundle bundle) {
        boolean z5 = false;
        if (i10 == 16) {
            Chip chip = this.f15741a;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.i;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z5 = true;
                }
                if (chip.f14554t) {
                    chip.f14553s.sendEventForVirtualView(1, 1);
                }
            }
        }
        return z5;
    }

    @Override // n2.b
    public final void f(int i, h2.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f20360a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f14538x);
            return;
        }
        Chip chip = this.f15741a;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        fVar.b(h2.c.f20348e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // n2.b
    public final void onPopulateNodeForHost(h2.f fVar) {
        Chip chip = this.f15741a;
        f fVar2 = chip.f14541f;
        fVar.f20360a.setCheckable(fVar2 != null && fVar2.R);
        fVar.f20360a.setClickable(chip.isClickable());
        fVar.i(chip.getAccessibilityClassName());
        fVar.l(chip.getText());
    }

    @Override // n2.b
    public final void onVirtualViewKeyboardFocusChanged(int i, boolean z5) {
        if (i == 1) {
            Chip chip = this.f15741a;
            chip.f14548n = z5;
            chip.refreshDrawableState();
        }
    }
}
