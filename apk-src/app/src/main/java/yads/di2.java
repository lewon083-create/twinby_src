package yads;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class di2 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final di2 f37774b = new di2();

    public di2() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] strArr;
        fi2[] values = fi2.values();
        String[] names = {"success", "error"};
        Annotation[][] entryAnnotations = {null, null};
        Intrinsics.checkNotNullParameter("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        uk.u descriptor = new uk.u("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", values.length);
        int length = values.length;
        boolean z5 = false;
        int i = 0;
        int i10 = 0;
        while (i < length) {
            fi2 fi2Var = values[i];
            int i11 = i10 + 1;
            String strName = (String) kotlin.collections.p.o(i10, names);
            if (strName == null) {
                strName = fi2Var.name();
            }
            descriptor.k(strName, z5);
            Annotation[] annotationArr = (Annotation[]) kotlin.collections.p.o(i10, entryAnnotations);
            if (annotationArr != null) {
                int length2 = annotationArr.length;
                for (?? r13 = z5; r13 < length2; r13++) {
                    Annotation annotation = annotationArr[r13];
                    Intrinsics.checkNotNullParameter(annotation, "annotation");
                    int i12 = descriptor.f34571d;
                    List[] listArr = descriptor.f34573f;
                    List arrayList = listArr[i12];
                    if (arrayList == null) {
                        strArr = names;
                        arrayList = new ArrayList(1);
                        listArr[descriptor.f34571d] = arrayList;
                    } else {
                        strArr = names;
                    }
                    arrayList.add(annotation);
                    names = strArr;
                }
            }
            i++;
            i10 = i11;
            names = names;
            z5 = false;
        }
        Intrinsics.checkNotNullParameter("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        uk.v vVar = new uk.v("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", values);
        vVar.f34596c = descriptor;
        return vVar;
    }
}
