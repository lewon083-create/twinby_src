package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class C0456ra extends D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0531ua f24685b;

    public C0456ra(int i) {
        this(i, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C0456ra(int i, InterfaceC0531ua interfaceC0531ua) {
        super(i);
        this.f24685b = interfaceC0531ua;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC0531ua
    @NonNull
    public final Ln a(List<Object> list) {
        int iB;
        int i = 0;
        if (list == null || (list.size() <= this.f22242a && this.f24685b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i10 = 0;
            for (Object obj : list) {
                if (i10 < this.f22242a) {
                    InterfaceC0531ua interfaceC0531ua = this.f24685b;
                    if (interfaceC0531ua != null) {
                        Ln lnA = interfaceC0531ua.a(obj);
                        Object obj2 = lnA.f22635a;
                        iB += lnA.f22636b.getBytesTruncated();
                        ko.a(obj, lnA.f22635a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i++;
                    iB += b(obj);
                }
                i10++;
            }
            list = arrayList;
        }
        return new Ln(list, new C0376o4(i, iB));
    }

    public final InterfaceC0531ua b() {
        return this.f24685b;
    }
}
