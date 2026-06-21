package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f25212a;

    public b() {
        this(new e());
    }

    public final ArrayList a(String str) {
        String[] strArrSplit = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            int i = 0;
            while (str2.length() > i) {
                int length = str2.length();
                int i10 = i + 3800;
                int iMin = Math.min(length, i10);
                if (length > i10) {
                    int iA = e.a(this.f25212a.f25217a.matcher(str2), i, iMin);
                    length = iA == -1 ? iMin : iA + 1;
                }
                arrayList.add(str2.substring(i, length));
                i = length;
            }
        }
        return arrayList;
    }

    public b(e eVar) {
        this.f25212a = eVar;
    }
}
