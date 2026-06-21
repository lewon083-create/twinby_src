package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import bc.d;
import bc.e;
import bc.f;
import com.twinby.R;
import fe.c;
import g2.n0;
import ic.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import nc.j;
import rc.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f14527l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f14530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f14531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer[] f14532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14534h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f14536k;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131887180), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f14528b = new ArrayList();
        this.f14529c = new c(6, this);
        this.f14530d = new LinkedHashSet();
        this.f14531e = new d(0, this);
        this.f14533g = false;
        this.f14536k = new HashSet();
        Context context2 = getContext();
        k.a(context2, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131887180);
        int[] iArr = vb.a.i;
        k.b(context2, attributeSet, iArr, R.attr.materialButtonToggleGroupStyle, 2131887180, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.materialButtonToggleGroupStyle, 2131887180);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(3, false));
        this.f14535j = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.i = typedArrayObtainStyledAttributes.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        Field field = n0.f19900a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && c(i10)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = n0.f19900a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f14529c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f14524p);
        nc.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f14528b.add(new f(shapeAppearanceModel.f29262e, shapeAppearanceModel.f29265h, shapeAppearanceModel.f29263f, shapeAppearanceModel.f29264g));
        materialButton.setEnabled(isEnabled());
        n0.k(materialButton, new e(0, this));
    }

    public final void b(int i, boolean z5) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f14536k);
        if (z5 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f14534h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z5 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f14536k;
        this.f14536k = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f14533g = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f14533g = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f14530d.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f14531e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f14532f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j jVarE = materialButton.getShapeAppearanceModel().e();
                f fVar2 = (f) this.f14528b.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z5 = getOrientation() == 0;
                    nc.a aVar = f.f2052e;
                    if (i == firstVisibleChildIndex) {
                        fVar = z5 ? k.e(this) ? new f(aVar, aVar, fVar2.f2054b, fVar2.f2055c) : new f(fVar2.f2053a, fVar2.f2056d, aVar, aVar) : new f(fVar2.f2053a, aVar, fVar2.f2054b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        fVar = z5 ? k.e(this) ? new f(fVar2.f2053a, fVar2.f2056d, aVar, aVar) : new f(aVar, aVar, fVar2.f2054b, fVar2.f2055c) : new f(aVar, fVar2.f2056d, aVar, fVar2.f2055c);
                    } else {
                        fVar2 = null;
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    jVarE.f29251e = new nc.a(0.0f);
                    jVarE.f29252f = new nc.a(0.0f);
                    jVarE.f29253g = new nc.a(0.0f);
                    jVarE.f29254h = new nc.a(0.0f);
                } else {
                    jVarE.f29251e = fVar2.f2053a;
                    jVarE.f29254h = fVar2.f2056d;
                    jVarE.f29252f = fVar2.f2054b;
                    jVarE.f29253g = fVar2.f2055c;
                }
                materialButton.setShapeAppearanceModel(jVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f14534h || this.f14536k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f14536k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = ((MaterialButton) getChildAt(i)).getId();
            if (this.f14536k.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i10) {
        Integer[] numArr = this.f14532f;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f14535j;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f14534h ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        e();
        a();
        super.onMeasure(i, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f14528b.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z5);
        }
    }

    public void setSelectionRequired(boolean z5) {
        this.i = z5;
    }

    public void setSingleSelection(boolean z5) {
        if (this.f14534h != z5) {
            this.f14534h = z5;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f14534h ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
