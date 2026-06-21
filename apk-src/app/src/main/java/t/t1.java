package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Range f33289e = new Range(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u.i f33290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.p f33291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij.p f33292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.p f33293d;

    public t1(u.i characteristics) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.f33290a = characteristics;
        final int i = 0;
        this.f33291b = ij.h.b(new Function0(this) { // from class: t.s1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t1 f33285c;

            {
                this.f33285c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int[] iArr = (int[]) this.f33285c.f33290a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z5 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    if (iArr[i10] == 9) {
                                        z5 = true;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z5);
                    case 1:
                        List list = (List) this.f33285c.f33293d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = p0.b.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = p0.b.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ni.i) this.f33285c.f33290a.c().f2019c).f29407c).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? kotlin.collections.p.l(highSpeedVideoSizes) : kotlin.collections.b0.f27475b;
                }
            }
        });
        final int i10 = 1;
        this.f33292c = ij.h.b(new Function0(this) { // from class: t.s1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t1 f33285c;

            {
                this.f33285c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int[] iArr = (int[]) this.f33285c.f33290a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z5 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i102 = 0;
                            while (true) {
                                if (i102 < length) {
                                    if (iArr[i102] == 9) {
                                        z5 = true;
                                    } else {
                                        i102++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z5);
                    case 1:
                        List list = (List) this.f33285c.f33293d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = p0.b.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = p0.b.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ni.i) this.f33285c.f33290a.c().f2019c).f29407c).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? kotlin.collections.p.l(highSpeedVideoSizes) : kotlin.collections.b0.f27475b;
                }
            }
        });
        final int i11 = 2;
        this.f33293d = ij.h.b(new Function0(this) { // from class: t.s1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t1 f33285c;

            {
                this.f33285c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        int[] iArr = (int[]) this.f33285c.f33290a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z5 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i102 = 0;
                            while (true) {
                                if (i102 < length) {
                                    if (iArr[i102] == 9) {
                                        z5 = true;
                                    } else {
                                        i102++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z5);
                    case 1:
                        List list = (List) this.f33285c.f33293d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = p0.b.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = p0.b.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ni.i) this.f33285c.f33290a.c().f2019c).f29407c).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? kotlin.collections.p.l(highSpeedVideoSizes) : kotlin.collections.b0.f27475b;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return kotlin.collections.b0.f27475b;
        }
        ArrayList arrayListT = CollectionsKt.T((Collection) CollectionsKt.D(list));
        Iterator it = CollectionsKt.z(list).iterator();
        while (it.hasNext()) {
            arrayListT.retainAll((List) it.next());
        }
        return arrayListT;
    }

    public final Range[] b(List surfaceSizes) {
        Intrinsics.checkNotNullParameter(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 <= size && size < 3 && CollectionsKt.y(surfaceSizes).size() == 1) {
            List listC = c((Size) surfaceSizes.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (surfaceSizes.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (Intrinsics.a(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object objS;
        List listR;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = ((StreamConfigurationMap) ((ni.i) this.f33290a.c().f2019c).f29407c).getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        Range[] rangeArr = (Range[]) objS;
        return (rangeArr == null || (listR = CollectionsKt.R(kotlin.collections.p.l(rangeArr))) == null) ? kotlin.collections.b0.f27475b : listR;
    }
}
