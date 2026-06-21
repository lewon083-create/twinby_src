package kotlin.text;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import g0.p2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t.b2;
import t.d2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27576d;

    public /* synthetic */ p(int i, Object obj, Object obj2) {
        this.f27574b = i;
        this.f27575c = obj;
        this.f27576d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long[] jArr;
        String[] strArrNames;
        int i = this.f27574b;
        boolean z5 = true;
        Object obj = this.f27576d;
        Object obj2 = this.f27575c;
        switch (i) {
            case 0:
                CharSequence input = (CharSequence) obj;
                q qVar = Regex.f27536c;
                Intrinsics.checkNotNullParameter(input, "input");
                Matcher matcher = ((Regex) obj2).f27537b.matcher(input);
                Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                if (matcher.find(0)) {
                    return new o(matcher, input);
                }
                return null;
            case 1:
                List surfaceConfigs = (List) obj;
                u.i characteristicsCompat = ((d2) obj2).f33022m;
                g0.g gVar = b2.f32957a;
                Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
                Intrinsics.checkNotNullParameter(surfaceConfigs, "surfaceConfigs");
                if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
                    z5 = false;
                } else {
                    HashSet hashSet = new HashSet();
                    for (long j10 : jArr) {
                        hashSet.add(Long.valueOf(j10));
                    }
                    Iterator it = surfaceConfigs.iterator();
                    while (it.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((p2) it.next()).f19719c.f19640b))) {
                            z5 = false;
                        }
                    }
                }
                return Boolean.valueOf(z5);
            case 2:
                uk.v vVar = (uk.v) obj2;
                String str = (String) obj;
                uk.u uVar = (uk.u) vVar.f34596c;
                if (uVar == null) {
                    Enum[] enumArr = (Enum[]) vVar.f34595b;
                    uVar = new uk.u(str, enumArr.length);
                    for (Enum r02 : enumArr) {
                        uVar.k(r02.name(), false);
                    }
                }
                return uVar;
            default:
                sk.f fVar = (sk.f) obj2;
                vk.c cVar = (vk.c) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                hi.h hVar = cVar.f34873a;
                wk.j.j(fVar, cVar);
                int iF = fVar.f();
                for (int i10 = 0; i10 < iF; i10++) {
                    List listH = fVar.h(i10);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listH) {
                        if (obj3 instanceof vk.s) {
                            arrayList.add(obj3);
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    vk.s sVar = (vk.s) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (sVar != null && (strArrNames = sVar.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = Intrinsics.a(fVar.e(), sk.h.f32936c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new qk.e("The suggested name '" + str2 + "' for " + str3 + ' ' + fVar.g(i10) + " is already one of the names for " + str3 + ' ' + fVar.g(((Number) j0.e(str2, linkedHashMap)).intValue()) + " in " + fVar);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i10));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? j0.d() : linkedHashMap;
        }
    }
}
