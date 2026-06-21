package wd;

import a0.e1;
import a0.e2;
import a0.l1;
import a0.q2;
import a0.r1;
import a0.u1;
import a7.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.camera.core.ImageProcessingUtil;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.auth.m;
import com.google.android.gms.internal.measurement.b4;
import com.twinby.R;
import g0.d0;
import ij.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;
import m4.n;
import nc.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f3.b, b6.a, m4.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f35240b;

    public static d b(Context context, int i) {
        f2.g.a("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, vb.a.f34819k);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        b4.u(context, typedArrayObtainStyledAttributes, 4);
        b4.u(context, typedArrayObtainStyledAttributes, 9);
        b4.u(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new nc.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        d dVar = new d();
        f2.g.f(rect.left);
        f2.g.f(rect.top);
        f2.g.f(rect.right);
        f2.g.f(rect.bottom);
        return dVar;
    }

    public static c0.c d(u1 sessionConfig, d0 cameraInfoInternal) {
        e0.e eVarD;
        l resolver = new l(cameraInfoInternal);
        Intrinsics.checkNotNullParameter(sessionConfig, "<this>");
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        com.google.android.gms.internal.auth.g.e("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + sessionConfig + ", lensFacing = " + cameraInfoInternal.l());
        Set set = (Set) sessionConfig.f231g;
        List list = (List) sessionConfig.f228d;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List list2 = (List) sessionConfig.f229e;
        if (set.isEmpty() && list.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                q2 q2Var = (q2) it.next();
                c0.d.f2180c.getClass();
                if (g8.g.i(q2Var) == c0.d.f2185h) {
                    eVarD = new e0.c(q2Var);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        e0.d dVarF = l.f((b0.a) it2.next(), list2);
                        if (dVarF != null) {
                            eVarD = dVarF;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            e0.d dVarF2 = l.f((b0.a) obj, list2);
                            if (dVarF2 != null) {
                                com.google.android.gms.internal.auth.g.e("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + dVarF2);
                            } else {
                                dVarF2 = null;
                            }
                            if (dVarF2 == null) {
                                arrayList.add(obj);
                            }
                        }
                        com.google.android.gms.internal.auth.g.e("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        eVarD = resolver.d(sessionConfig, arrayList, 0, b0.f27475b);
                    }
                }
            }
        }
        if (eVarD instanceof e0.a) {
            c0.c cVar = ((e0.a) eVarD).f15879a;
            com.google.android.gms.internal.auth.g.e("ResolvedFeatureGroup", "resolvedFeatureGroup = " + cVar);
            return cVar;
        }
        if (eVarD instanceof e0.b) {
            throw new IllegalArgumentException("Feature group is not supported");
        }
        if (eVarD instanceof e0.c) {
            throw new IllegalArgumentException(((e0.c) eVarD).f15881a + " is not supported");
        }
        if (!(eVarD instanceof e0.d)) {
            throw new j();
        }
        StringBuilder sb2 = new StringBuilder();
        e0.d dVar = (e0.d) eVarD;
        sb2.append(dVar.f15882a);
        sb2.append(" must be added for ");
        sb2.append(dVar.f15883b);
        throw new IllegalArgumentException(sb2.toString());
    }

    public Object a(Object obj) throws Throwable {
        UnsupportedOperationException unsupportedOperationException;
        Throwable th2;
        Bitmap bitmapCreateBitmap;
        q0.b bVar = (q0.b) obj;
        int i = bVar.f31551c;
        Object obj2 = bVar.f31549a;
        int i10 = bVar.f31554f;
        e2 e2Var = null;
        try {
            try {
                if (i == 35) {
                    r1 r1Var = (r1) obj2;
                    boolean z5 = i10 % 180 != 0;
                    e2 e2Var2 = new e2(a0.e.e(z5 ? r1Var.getHeight() : r1Var.getWidth(), z5 ? r1Var.getWidth() : r1Var.getHeight(), 1, 2));
                    try {
                        e1 e1VarD = ImageProcessingUtil.d(r1Var, e2Var2, ByteBuffer.allocateDirect(r1Var.getWidth() * r1Var.getHeight() * 4), i10, false);
                        r1Var.close();
                        if (e1VarD == null) {
                            throw new l1("Can't covert YUV to RGB", null, 0);
                        }
                        bitmapCreateBitmap = m.f(e1VarD);
                        e1VarD.close();
                        e2Var = e2Var2;
                    } catch (UnsupportedOperationException e3) {
                        unsupportedOperationException = e3;
                        throw new l1("Can't convert " + (i == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException, 0);
                    } catch (Throwable th3) {
                        th2 = th3;
                        e2Var = e2Var2;
                        if (e2Var == null) {
                            throw th2;
                        }
                        e2Var.close();
                        throw th2;
                    }
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + i);
                    }
                    r1 r1Var2 = (r1) obj2;
                    Bitmap bitmapF = m.f(r1Var2);
                    r1Var2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i10);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapF, 0, 0, bitmapF.getWidth(), bitmapF.getHeight(), matrix, true);
                }
                if (e2Var != null) {
                    e2Var.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e7) {
                unsupportedOperationException = e7;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // b6.a
    public CharSequence c(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f1647b.getString(R.string.not_set);
        }
        return null;
    }

    @Override // m4.i
    public /* bridge */ /* synthetic */ void e(m4.k kVar, long j10, long j11) {
    }

    @Override // m4.i
    public o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        return n.f28669f;
    }

    @Override // m4.i
    public /* bridge */ /* synthetic */ void m(m4.k kVar, long j10, long j11, boolean z5) {
    }
}
