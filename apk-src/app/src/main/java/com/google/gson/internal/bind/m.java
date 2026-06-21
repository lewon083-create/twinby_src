package com.google.gson.internal.bind;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import me.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f14982b;

    public /* synthetic */ m(w wVar, int i) {
        this.f14981a = i;
        this.f14982b = wVar;
    }

    @Override // me.w
    public final Object a(re.b bVar) {
        switch (this.f14981a) {
            case 0:
                Date date = (Date) this.f14982b.a(bVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) this.f14982b.a(bVar)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                bVar.beginArray();
                while (bVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) this.f14982b.a(bVar)).longValue()));
                }
                bVar.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (bVar.s() != 9) {
                    return this.f14982b.a(bVar);
                }
                bVar.nextNull();
                return null;
        }
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        switch (this.f14981a) {
            case 0:
                this.f14982b.b(cVar, (Timestamp) obj);
                break;
            case 1:
                this.f14982b.b(cVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f14982b.b(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.endArray();
                break;
            default:
                if (obj == null) {
                    cVar.i();
                } else {
                    this.f14982b.b(cVar, obj);
                }
                break;
        }
    }
}
