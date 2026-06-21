package z2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import io.sentry.protocol.Request;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f46010b;

    public y(h0 h0Var) {
        this.f46010b = h0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        m0 m0VarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        h0 h0Var = this.f46010b;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, h0Var);
        }
        if (Request.JsonKeys.FRAGMENT.equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.a.f36298a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = t.class.isAssignableFrom(b0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    t fragment = resourceId != -1 ? h0Var.C(resourceId) : null;
                    if (fragment == null && string != null) {
                        fragment = h0Var.D(string);
                    }
                    if (fragment == null && id2 != -1) {
                        fragment = h0Var.C(id2);
                    }
                    if (fragment == null) {
                        b0 b0VarH = h0Var.H();
                        context.getClassLoader();
                        fragment = b0VarH.a(attributeValue);
                        fragment.f45980o = true;
                        fragment.f45989x = resourceId != 0 ? resourceId : id2;
                        fragment.f45990y = id2;
                        fragment.f45991z = string;
                        fragment.f45981p = true;
                        fragment.f45985t = h0Var;
                        v vVar = h0Var.f45862v;
                        fragment.f45986u = vVar;
                        w wVar = vVar.f45996d;
                        fragment.E = true;
                        if ((vVar != null ? vVar.f45995c : null) != null) {
                            fragment.E = true;
                        }
                        m0VarG = h0Var.a(fragment);
                        if (h0.K(2)) {
                            Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragment.f45981p) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fragment.f45981p = true;
                        fragment.f45985t = h0Var;
                        v vVar2 = h0Var.f45862v;
                        fragment.f45986u = vVar2;
                        w wVar2 = vVar2.f45996d;
                        fragment.E = true;
                        if ((vVar2 != null ? vVar2.f45995c : null) != null) {
                            fragment.E = true;
                        }
                        m0VarG = h0Var.g(fragment);
                        if (h0.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    a3.c cVar = a3.d.f416a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    a3.e eVar = new a3.e(fragment, viewGroup);
                    a3.d.c(eVar);
                    a3.c cVarA = a3.d.a(fragment);
                    if (cVarA.f414a.contains(a3.b.f409e) && a3.d.e(cVarA, fragment.getClass(), a3.e.class)) {
                        a3.d.b(cVarA, eVar);
                    }
                    fragment.F = viewGroup;
                    m0VarG.k();
                    m0VarG.j();
                    View view2 = fragment.G;
                    if (view2 == null) {
                        throw new IllegalStateException(pe.a.f("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.G.getTag() == null) {
                        fragment.G.setTag(string);
                    }
                    fragment.G.addOnAttachStateChangeListener(new i7.j(this, m0VarG));
                    return fragment.G;
                }
            }
        }
        return null;
    }
}
