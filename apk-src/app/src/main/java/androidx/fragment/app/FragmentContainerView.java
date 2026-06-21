package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.twinby.R;
import g2.n0;
import g2.x1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y2.a;
import z2.b0;
import z2.h0;
import z2.m0;
import z2.t;
import z2.v;
import z2.w;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1522b = new ArrayList();
        this.f1523c = new ArrayList();
        this.f1525e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = a.f36299b;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f1523c.contains(view)) {
            this.f1522b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof t ? (t) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        x1 x1VarG;
        Intrinsics.checkNotNullParameter(insets, "insets");
        x1 x1VarG2 = x1.g(null, insets);
        Intrinsics.checkNotNullExpressionValue(x1VarG2, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1524d;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(this, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            x1VarG = x1.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            Field field = n0.f19900a;
            WindowInsets windowInsetsF = x1VarG2.f();
            if (windowInsetsF != null) {
                onApplyWindowInsets(windowInsetsF);
                if (!windowInsetsF.equals(windowInsetsF)) {
                    x1VarG2 = x1.g(this, windowInsetsF);
                }
            }
            x1VarG = x1VarG2;
        }
        Intrinsics.checkNotNullExpressionValue(x1VarG, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!x1VarG.f19943a.q()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                n0.a(getChildAt(i), x1VarG);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f1525e) {
            Iterator it = this.f1522b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f1525e) {
            ArrayList arrayList = this.f1522b;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f1523c.remove(view);
        if (this.f1522b.remove(view)) {
            this.f1525e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends t> F getFragment() {
        w wVar;
        t tVar;
        h0 h0VarI;
        View view = this;
        while (true) {
            wVar = null;
            if (view == null) {
                tVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (tVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof w) {
                    wVar = (w) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (wVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            h0VarI = wVar.i();
        } else {
            if (tVar.f45986u == null || !tVar.f45977l) {
                throw new IllegalStateException("The Fragment " + tVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            h0VarI = tVar.k();
        }
        return (F) h0VarI.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i10) {
        int i11 = i + i10;
        for (int i12 = i; i12 < i11; i12++) {
            View view = getChildAt(i12);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i10) {
        int i11 = i + i10;
        for (int i12 = i; i12 < i11; i12++) {
            View view = getChildAt(i12);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z5) {
        this.f1525e = z5;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f1524d = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f1523c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, h0 fm) {
        View view;
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f1522b = new ArrayList();
        this.f1523c = new ArrayList();
        this.f1525e = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = a.f36299b;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        t tVarC = fm.C(id2);
        if (classAttribute != null && tVarC == null) {
            if (id2 == -1) {
                throw new IllegalStateException(pe.a.f("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            b0 b0VarH = fm.H();
            context.getClassLoader();
            t tVarA = b0VarH.a(classAttribute);
            Intrinsics.checkNotNullExpressionValue(tVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            tVarA.f45989x = id2;
            tVarA.f45990y = id2;
            tVarA.f45991z = string;
            tVarA.f45985t = fm;
            v vVar = fm.f45862v;
            tVarA.f45986u = vVar;
            tVarA.E = true;
            if ((vVar == null ? null : vVar.f45995c) != null) {
                tVarA.E = true;
            }
            z2.a aVar = new z2.a(fm);
            aVar.f45798o = true;
            tVarA.F = this;
            aVar.e(getId(), tVarA, string, 1);
            if (!aVar.f45791g) {
                h0 h0Var = aVar.f45799p;
                if (h0Var.f45862v != null && !h0Var.I) {
                    h0Var.z(true);
                    aVar.a(h0Var.K, h0Var.L);
                    h0Var.f45843b = true;
                    try {
                        h0Var.V(h0Var.K, h0Var.L);
                        h0Var.d();
                        h0Var.g0();
                        h0Var.v();
                        ((HashMap) h0Var.f45844c.f32796c).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th2) {
                        h0Var.d();
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (m0 m0Var : fm.f45844c.x()) {
            t tVar = m0Var.f45905c;
            if (tVar.f45990y == getId() && (view = tVar.G) != null && view.getParent() == null) {
                tVar.F = this;
                m0Var.b();
            }
        }
    }
}
