package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vk.c f44933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jn f44934b;

    public y61(vk.c cVar, jn jnVar) {
        this.f44933a = cVar;
        this.f44934b = jnVar;
    }

    public final String a(m80 m80Var) {
        ArrayList arrayListL;
        vk.c cVar = this.f44933a;
        vk.c.f34872d.getClass();
        String strB = cVar.b(m80.Companion.serializer(), m80Var);
        this.f44934b.getClass();
        String strA = jn.a(strB);
        if (strA == null) {
            strA = "";
        }
        Iterable eVar = new ck.e('A', 'Z');
        ck.e elements = new ck.e('a', 'z');
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (eVar instanceof Collection) {
            arrayListL = CollectionsKt.L((Collection) eVar, elements);
        } else {
            ArrayList arrayList = new ArrayList();
            kotlin.collections.x.m(arrayList, eVar);
            kotlin.collections.x.m(arrayList, elements);
            arrayListL = arrayList;
        }
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(intRange, 10));
        ck.g gVarA = intRange.iterator();
        while (gVarA.f2383d) {
            gVarA.nextInt();
            ak.c random = ak.d.f1037b;
            Intrinsics.checkNotNullParameter(arrayListL, "<this>");
            Intrinsics.checkNotNullParameter(random, "random");
            if (arrayListL.isEmpty()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            int size = arrayListL.size();
            random.getClass();
            int iNextInt = ak.d.f1038c.a().nextInt(size);
            Intrinsics.checkNotNullParameter(arrayListL, "<this>");
            Character ch2 = (Character) arrayListL.get(iNextInt);
            ch2.getClass();
            arrayList2.add(ch2);
        }
        return com.google.android.gms.internal.ads.om1.x(CollectionsKt.I(arrayList2, "", null, null, null, 62), strA);
    }
}
