package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0581wa extends D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0506ta f24973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0506ta f24974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0556va f24975d;

    public C0581wa(int i, int i10, int i11) {
        this(i, new C0506ta(i10), new C0506ta(i11));
    }

    public C0581wa(int i, @NonNull C0506ta c0506ta, @NonNull C0506ta c0506ta2) {
        super(i);
        this.f24975d = new C0556va();
        this.f24973b = c0506ta;
        this.f24974c = c0506ta2;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC0531ua
    @NonNull
    public final Ln a(Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f24975d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i10 = 0;
            boolean z5 = false;
            int i11 = 0;
            while (i < length) {
                Map.Entry entry = entryArr[i];
                Ln lnA = this.f24973b.a((String) entry.getKey());
                Ln lnA2 = this.f24974c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) lnA2.f22635a) + StringUtils.getUtf8BytesLength((String) lnA.f22635a);
                if (z5 || utf8BytesLength2 + i11 > this.f22242a) {
                    i10++;
                    bytesTruncated += utf8BytesLength;
                    z5 = true;
                } else {
                    bytesTruncated = lnA2.f22636b.getBytesTruncated() + lnA.f22636b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) lnA2.f22635a) + StringUtils.getUtf8BytesLength((String) lnA.f22635a) + i11;
                    map2.put((String) lnA.f22635a, (String) lnA2.f22635a);
                    i11 = utf8BytesLength3;
                }
                i++;
            }
            i = i10;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new Ln(map2, new C0376o4(i, bytesTruncated));
    }
}
