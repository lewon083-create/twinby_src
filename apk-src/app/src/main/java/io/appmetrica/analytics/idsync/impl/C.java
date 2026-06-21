package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k fromModel(@NotNull RequestConfig requestConfig) {
        k kVar = new k();
        String type = requestConfig.getType();
        Charset charset = Charsets.UTF_8;
        kVar.f21987a = type.getBytes(charset);
        j jVar = new j();
        jVar.f21985a = B.f21935a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        kVar.f21988b = jVar;
        kVar.f21989c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            i iVar = new i();
            iVar.f21982a = key.getBytes(Charsets.UTF_8);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                bArr[i] = value.get(i).getBytes(Charsets.UTF_8);
            }
            iVar.f21983b = bArr;
            arrayList.add(iVar);
        }
        Object[] array = arrayList.toArray(new i[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kVar.f21990d = (i[]) array;
        kVar.f21991e = requestConfig.getResendIntervalForValidResponse();
        kVar.f21992f = requestConfig.getResendIntervalForInvalidResponse();
        kVar.f21993g = CollectionsKt.Q(requestConfig.getValidResponseCodes());
        kVar.f21994h = requestConfig.getReportEventEnabled();
        String reportUrl = requestConfig.getReportUrl();
        if (reportUrl == null) {
            reportUrl = "";
        }
        kVar.i = reportUrl;
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.idsync.internal.model.RequestConfig toModel(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.idsync.impl.k r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r0.f21987a
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r1.<init>(r2, r3)
            io.appmetrica.analytics.idsync.internal.model.Preconditions r2 = new io.appmetrica.analytics.idsync.internal.model.Preconditions
            io.appmetrica.analytics.idsync.impl.j r4 = r0.f21988b
            if (r4 == 0) goto L1d
            int r4 = r4.f21985a
            r5 = 1
            if (r4 != r5) goto L19
            io.appmetrica.analytics.idsync.internal.model.NetworkType r4 = io.appmetrica.analytics.idsync.internal.model.NetworkType.CELL
            goto L1b
        L19:
            io.appmetrica.analytics.idsync.internal.model.NetworkType r4 = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY
        L1b:
            if (r4 != 0) goto L1f
        L1d:
            io.appmetrica.analytics.idsync.internal.model.NetworkType r4 = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY
        L1f:
            r2.<init>(r4)
            r4 = r2
            java.lang.String r2 = new java.lang.String
            byte[] r5 = r0.f21989c
            r2.<init>(r5, r3)
            io.appmetrica.analytics.idsync.impl.i[] r3 = r0.f21990d
            int r5 = r3.length
            int r5 = kotlin.collections.i0.b(r5)
            r6 = 16
            if (r5 >= r6) goto L36
            r5 = r6
        L36:
            r6 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r5)
            int r5 = r3.length
            r8 = 0
        L3e:
            if (r8 >= r5) goto L6c
            r9 = r3[r8]
            java.lang.String r10 = new java.lang.String
            byte[] r11 = r9.f21982a
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
            r10.<init>(r11, r12)
            byte[][] r9 = r9.f21983b
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r9.length
            r11.<init>(r12)
            int r12 = r9.length
            r13 = 0
        L55:
            if (r13 >= r12) goto L66
            r14 = r9[r13]
            java.lang.String r15 = new java.lang.String
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8
            r15.<init>(r14, r7)
            r11.add(r15)
            int r13 = r13 + 1
            goto L55
        L66:
            r4.put(r10, r11)
            int r8 = r8 + 1
            goto L3e
        L6c:
            long r7 = r0.f21991e
            r3 = r6
            r5 = r7
            long r7 = r0.f21992f
            int[] r9 = r0.f21993g
            java.util.List r9 = kotlin.collections.p.u(r9)
            boolean r10 = r0.f21994h
            java.lang.String r0 = r0.i
            int r11 = r0.length()
            if (r11 <= 0) goto L84
        L82:
            r11 = r0
            goto L86
        L84:
            r0 = 0
            goto L82
        L86:
            io.appmetrica.analytics.idsync.internal.model.RequestConfig r0 = new io.appmetrica.analytics.idsync.internal.model.RequestConfig
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.idsync.impl.C.toModel(io.appmetrica.analytics.idsync.impl.k):io.appmetrica.analytics.idsync.internal.model.RequestConfig");
    }
}
