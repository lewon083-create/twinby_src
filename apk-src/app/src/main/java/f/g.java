package f;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f16458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g.b f16460d;

    public /* synthetic */ g(h hVar, String str, g.b bVar, int i) {
        this.f16457a = i;
        this.f16458b = hVar;
        this.f16459c = str;
        this.f16460d = bVar;
    }

    @Override // f.c
    public final void a(Object obj) {
        switch (this.f16457a) {
            case 0:
                h hVar = this.f16458b;
                ArrayList arrayList = hVar.f16464d;
                LinkedHashMap linkedHashMap = hVar.f16462b;
                String str = this.f16459c;
                Object obj2 = linkedHashMap.get(str);
                g.b bVar = this.f16460d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    hVar.b(iIntValue, bVar, obj);
                    return;
                } catch (Exception e3) {
                    arrayList.remove(str);
                    throw e3;
                }
            default:
                h hVar2 = this.f16458b;
                ArrayList arrayList2 = hVar2.f16464d;
                LinkedHashMap linkedHashMap2 = hVar2.f16462b;
                String str2 = this.f16459c;
                Object obj3 = linkedHashMap2.get(str2);
                g.b bVar2 = this.f16460d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    hVar2.b(iIntValue2, bVar2, obj);
                    return;
                } catch (Exception e7) {
                    arrayList2.remove(str2);
                    throw e7;
                }
        }
    }
}
