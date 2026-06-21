package ek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uk.q0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16418c;

    public /* synthetic */ o(int i, Object obj) {
        this.f16417b = i;
        this.f16418c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f16417b) {
            case 0:
                aj.e eVar = (aj.e) this.f16418c;
                Intrinsics.checkNotNullParameter(it, "it");
                return eVar.invoke();
            case 1:
                i0.p pVar = (i0.p) this.f16418c;
                pVar.f20809p.getClass();
                pVar.k(it);
                return Unit.f27471a;
            case 2:
                return it == ((kotlin.collections.a) this.f16418c) ? "(this Collection)" : String.valueOf(it);
            case 3:
                ((pk.c) this.f16418c).e(null);
                return Unit.f27471a;
            case 4:
                sk.g gVar = (sk.g) this.f16418c;
                int iIntValue = ((Integer) it).intValue();
                return gVar.f32929f[iIntValue] + ": " + gVar.f32930g[iIntValue].a();
            case 5:
                ArrayList arrayList = (ArrayList) this.f16418c;
                String it2 = (String) it;
                Intrinsics.checkNotNullParameter(it2, "it");
                arrayList.add(it2);
                return Unit.f27471a;
            case 6:
                uk.v vVar = (uk.v) this.f16418c;
                sk.a buildSerialDescriptor = (sk.a) it;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                b0 b0Var = (b0) vVar.f34596c;
                buildSerialDescriptor.getClass();
                Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
                buildSerialDescriptor.f32909b = b0Var;
                return Unit.f27471a;
            case 7:
                q0 q0Var = (q0) this.f16418c;
                int iIntValue2 = ((Integer) it).intValue();
                return q0Var.f34572e[iIntValue2] + ": " + q0Var.i(iIntValue2).a();
            case 8:
                return ((a0.b0) this.f16418c).f39m;
            default:
                wd.i iVar = (wd.i) this.f16418c;
                t2.b bVar = (t2.b) it;
                t2.e eVar2 = wd.i.f35246c;
                long j10 = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        t2.e eVar3 = (t2.e) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = iVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            if (!hashSet.add(obj)) {
                                throw new IllegalArgumentException("duplicate element: " + obj);
                            }
                            bVar.e(eVar3, Collections.unmodifiableSet(hashSet));
                            j10++;
                        } else {
                            bVar.d(eVar3);
                        }
                    }
                }
                if (j10 == 0) {
                    bVar.d(eVar2);
                    return null;
                }
                bVar.e(eVar2, Long.valueOf(j10));
                return null;
        }
    }

    public /* synthetic */ o(pk.c cVar, pk.b bVar) {
        this.f16417b = 3;
        this.f16418c = cVar;
    }
}
