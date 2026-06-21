package u0;

import ac.i;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import g0.d0;
import g0.f0;
import g0.x2;
import i0.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f33983h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f33984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rational f33985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f33986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f33987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f33988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f33989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f33990g;

    public b(f0 f0Var, HashSet hashSet) {
        Size sizeG = q.g(f0Var.p().h());
        d0 d0VarP = f0Var.p();
        i iVar = new i(d0VarP, sizeG);
        this.f33990g = new HashMap();
        this.f33984a = sizeG;
        Rational rational = ((double) sizeG.getWidth()) / ((double) sizeG.getHeight()) > f33983h ? i0.b.f20761c : i0.b.f20759a;
        com.google.android.gms.internal.auth.g.e("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + sizeG + ") is " + rational + ".");
        this.f33985b = rational;
        Rational rational2 = i0.b.f20759a;
        if (rational.equals(rational2)) {
            rational2 = i0.b.f20761c;
        } else if (!rational.equals(i0.b.f20761c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f33986c = rational2;
        this.f33989f = d0VarP;
        this.f33987d = hashSet;
        this.f33988e = iVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalH = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalH2 = h(size);
        if (rationalH.floatValue() == rationalH2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalH.floatValue() > rationalH2.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rationalH.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rationalH.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean d(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final a b(x2 x2Var, Rect rect, int i, boolean z5) {
        boolean z10;
        Size size;
        Size size2;
        Pair pairCreate;
        if (q.d(i)) {
            z10 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z10 = false;
        }
        if (z5) {
            Size sizeG = q.g(rect);
            Iterator it = c(x2Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeG, sizeG);
                    break;
                }
                Size size3 = (Size) it.next();
                Size sizeG2 = q.g(a(size3, sizeG));
                if (!d(sizeG2, sizeG)) {
                    pairCreate = Pair.create(size3, sizeG2);
                    break;
                }
            }
            size = (Size) pairCreate.first;
            size2 = (Size) pairCreate.second;
        } else {
            Size sizeG3 = q.g(rect);
            List listC = c(x2Var);
            Iterator it2 = listC.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listC.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = sizeG3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!d(size, sizeG3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rationalH = i0.b.f20759a;
                    Size size5 = p0.b.f30756c;
                    if (!i0.b.a(sizeG3, rationalH, size5)) {
                        rationalH = i0.b.f20761c;
                        if (!i0.b.a(sizeG3, rationalH, size5)) {
                            rationalH = h(sizeG3);
                        }
                    }
                    if (!e(rationalH, size4) && !d(size4, sizeG3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = a(sizeG3, size);
            size2 = size;
        }
        return z10 ? new a(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new a(rect, size2, size);
    }

    public final List c(x2 x2Var) {
        Rational rationalH;
        if (!this.f33987d.contains(x2Var)) {
            throw new IllegalArgumentException("Invalid child config: " + x2Var);
        }
        HashMap map = this.f33990g;
        if (map.containsKey(x2Var)) {
            List list = (List) map.get(x2Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listE = this.f33988e.e(x2Var);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalH = null;
                    break;
                }
                rationalH = (Rational) it.next();
                Rational rational = i0.b.f20759a;
                if (i0.b.a(size, rationalH, p0.b.f30756c)) {
                    break;
                }
            }
            if (rationalH != null) {
                Size size2 = (Size) map2.get(rationalH);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalH = h(size);
            }
            arrayList.add(size);
            map2.put(rationalH, size);
        }
        map.put(x2Var, arrayList);
        return arrayList;
    }

    public final boolean e(Rational rational, Size size) {
        Rational rational2 = this.f33985b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = i0.b.f20759a;
        Size size2 = p0.b.f30756c;
        if (i0.b.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalH = i0.b.f20759a;
        if (!i0.b.a(size, rationalH, size2)) {
            rationalH = i0.b.f20761c;
            if (!i0.b.a(size, rationalH, size2)) {
                rationalH = h(size);
            }
        }
        float fFloatValue3 = rationalH.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
    }

    public final ArrayList f(List list, boolean z5) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = i0.b.f20759a;
        map.put(rational, new ArrayList());
        Rational rational2 = i0.b.f20761c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (i0.b.a(size, rational3, p0.b.f30756c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalH = h(size);
                    arrayList2.add(rationalH);
                    map.put(rationalH, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new bc.d(1, h(this.f33984a)));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(i0.b.f20761c) && !rational4.equals(i0.b.f20759a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(g(rational4, list2, z5));
            }
        }
        return arrayList4;
    }

    public final ArrayList g(Rational rational, List list, boolean z5) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = i0.b.f20759a;
            if (i0.b.a(size, rational, p0.b.f30756c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new i0.f(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f33987d.iterator();
        while (it2.hasNext()) {
            List<Size> listC = c((x2) it2.next());
            if (!z5) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listC) {
                    if (!e(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listC = arrayList3;
            }
            if (listC.isEmpty()) {
                return new ArrayList();
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listC.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!d((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listC.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listC.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (d((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
