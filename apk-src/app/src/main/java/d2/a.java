package d2;

import ad.a1;
import ad.x;
import ad.z;
import android.util.Size;
import io.sentry.android.core.anr.AggregatedStackTrace;
import io.sentry.android.core.anr.AnrCulpritIdentifier;
import j3.o;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l4.l;
import l4.p;
import m4.r;
import yads.d13;
import yads.df1;
import yads.e13;
import yads.ef0;
import yads.hf0;
import yads.if0;
import yads.xe0;
import yads.zr;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15525b;

    public /* synthetic */ a(int i) {
        this.f15525b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15525b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    byte b10 = bArr2[i];
                    if (b2 != b10) {
                        return b2 - b10;
                    }
                }
                return 0;
            case 1:
                return e4.j.b(((e4.i) obj).f16130a.f16122c, ((e4.i) obj2).f16130a.f16122c);
            case 2:
                return ((g0.g) obj).f19561a.compareTo(((g0.g) obj2).f19561a);
            case 3:
                return AnrCulpritIdentifier.lambda$identify$0((AggregatedStackTrace) obj, (AggregatedStackTrace) obj2);
            case 4:
                return ((o) obj2).f26331j - ((o) obj).f26331j;
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 6:
                return Integer.compare(((l4.g) ((List) obj).get(0)).f27858g, ((l4.g) ((List) obj2).get(0)).f27858g);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i10 = 11;
                return x.f(l4.o.c((l4.o) Collections.max(list, new a(10)), (l4.o) Collections.max(list2, new a(10)))).a(list.size(), list2.size()).b((l4.o) Collections.max(list, new a(i10)), (l4.o) Collections.max(list2, new a(i10)), new a(i10)).e();
            case 8:
                return ((l4.f) Collections.max((List) obj)).compareTo((l4.f) Collections.max((List) obj2));
            case 9:
                return ((l) ((List) obj).get(0)).compareTo((l) ((List) obj2).get(0));
            case 10:
                return l4.o.c((l4.o) obj, (l4.o) obj2);
            case 11:
                l4.o oVar = (l4.o) obj;
                l4.o oVar2 = (l4.o) obj2;
                boolean z5 = oVar.f27883f;
                int i11 = oVar.f27887k;
                a1 a1VarA = (z5 && oVar.i) ? p.f27901k : p.f27901k.a();
                oVar.f27884g.getClass();
                return z.f896a.b(Integer.valueOf(oVar.f27888l), Integer.valueOf(oVar2.f27888l), a1VarA).b(Integer.valueOf(i11), Integer.valueOf(oVar2.f27887k), a1VarA).e();
            case 12:
                return ((r) obj).f28680a - ((r) obj2).f28680a;
            case 13:
                return Float.compare(((r) obj).f28682c, ((r) obj2).f28682c);
            case 14:
                return Integer.compare(((o5.d) obj2).f29735b, ((o5.d) obj).f29735b);
            case 15:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 16:
                w3.b bVar = (w3.b) obj;
                w3.b bVar2 = (w3.b) obj2;
                int iCompare = Integer.compare(bVar.f35027c, bVar2.f35027c);
                return iCompare != 0 ? iCompare : bVar.f35026b.compareTo(bVar2.f35026b);
            case 17:
                return Integer.compare(((w5.d) obj).f35149a.f35152b, ((w5.d) obj2).f35149a.f35152b);
            case 18:
                return Long.compare(((w5.c) obj).f35146b, ((w5.c) obj2).f35146b);
            case 19:
                return ((z3.d) obj).f46039a.compareTo(((z3.d) obj2).f46039a);
            case 20:
                return df1.a((zr) obj, (zr) obj2);
            case 21:
                return e13.a((d13) obj, (d13) obj2);
            case 22:
                return Float.compare(((d13) obj).f37593c, ((d13) obj2).f37593c);
            case 23:
                return hf0.a((hf0) obj, (hf0) obj2);
            case 24:
                return hf0.b((hf0) obj, (hf0) obj2);
            case 25:
                return xe0.a((List) obj, (List) obj2);
            case 26:
                return ef0.a((List) obj, (List) obj2);
            case 27:
                return hf0.a((List) obj, (List) obj2);
            case 28:
                return if0.a((Integer) obj, (Integer) obj2);
            default:
                return if0.b((Integer) obj, (Integer) obj2);
        }
    }
}
