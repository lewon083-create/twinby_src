package com.vk.api.sdk.browser;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class DelimitedVersion implements Comparable<DelimitedVersion> {
    private static final long BIT_MASK_32 = -1;
    private static final int PRIME_HASH_FACTOR = 92821;
    private final long[] mNumericParts;

    public DelimitedVersion(long[] jArr) {
        this.mNumericParts = jArr;
    }

    private static int compareLongs(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static DelimitedVersion parse(String str) {
        if (str == null) {
            return new DelimitedVersion(new long[0]);
        }
        String[] strArrSplit = str.split("[^0-9]+");
        long[] jArr = new long[strArrSplit.length];
        int i = 0;
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                jArr[i] = Long.parseLong(str2);
                i++;
            }
        }
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (jArr[i] <= 0);
        int i10 = i + 1;
        long[] jArr2 = new long[i10];
        System.arraycopy(jArr, 0, jArr2, 0, i10);
        return new DelimitedVersion(jArr2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof DelimitedVersion) && compareTo((DelimitedVersion) obj) == 0;
    }

    public int hashCode() {
        int i = 0;
        for (long j10 : this.mNumericParts) {
            i = (i * PRIME_HASH_FACTOR) + ((int) j10);
        }
        return i;
    }

    public String toString() {
        if (this.mNumericParts.length == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mNumericParts[0]);
        for (int i = 1; i < this.mNumericParts.length; i++) {
            sb2.append('.');
            sb2.append(this.mNumericParts[i]);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return compareLongs(r1.length, r6.mNumericParts.length);
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(com.vk.api.sdk.browser.DelimitedVersion r6) {
        /*
            r5 = this;
            r0 = 0
        L1:
            long[] r1 = r5.mNumericParts
            int r2 = r1.length
            if (r0 >= r2) goto L19
            long[] r2 = r6.mNumericParts
            int r3 = r2.length
            if (r0 >= r3) goto L19
            r3 = r1[r0]
            r1 = r2[r0]
            int r1 = compareLongs(r3, r1)
            if (r1 == 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            int r0 = r1.length
            long r0 = (long) r0
            long[] r6 = r6.mNumericParts
            int r6 = r6.length
            long r2 = (long) r6
            int r6 = compareLongs(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.browser.DelimitedVersion.compareTo(com.vk.api.sdk.browser.DelimitedVersion):int");
    }
}
