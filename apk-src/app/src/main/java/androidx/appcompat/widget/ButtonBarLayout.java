package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1134d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1134d = -1;
        int[] iArr = h.a.i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        n0.j(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f1132b = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1132b);
        }
    }

    private void setStacked(boolean z5) {
        if (this.f1133c != z5) {
            if (!z5 || this.f1132b) {
                this.f1133c = z5;
                setOrientation(z5 ? 1 : 0);
                setGravity(z5 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z5 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int iMakeMeasureSpec;
        boolean z5;
        int i11;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f1132b) {
            if (size > this.f1134d && this.f1133c) {
                setStacked(false);
            }
            this.f1134d = size;
        }
        if (this.f1133c || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z5 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
            z5 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i10);
        if (this.f1132b && !this.f1133c && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z5 = true;
        }
        if (z5) {
            super.onMeasure(i, i10);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i11 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1133c) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i13).getVisibility() == 0) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
                paddingBottom = i11 >= 0 ? getChildAt(i11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = n0.f19900a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i10 == 0) {
                super.onMeasure(i, i10);
            }
        }
    }

    public void setAllowStacking(boolean z5) {
        if (this.f1132b != z5) {
            this.f1132b = z5;
            if (!z5 && this.f1133c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
