package fk;

import i0.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f19468c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f19469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f19470e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19471b;

    static {
        int i = c.f19472a;
        f19469d = o.s(4611686018427387903L);
        f19470e = o.s(-4611686018427387903L);
    }

    public static final long a(long j10, long j11) {
        long j12 = 1000000;
        long j13 = j11 / j12;
        long j14 = j10 + j13;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return o.s(ck.o.c(j14, -4611686018427387903L, 4611686018427387903L));
        }
        return o.u((j14 * j12) + (j11 - (j13 * j12)));
    }

    public static final void b(StringBuilder sb2, int i, int i10, int i11, String str, boolean z5) {
        sb2.append(i);
        if (i10 != 0) {
            sb2.append('.');
            String strG = StringsKt.G(i11, String.valueOf(i10));
            int i12 = -1;
            int length = strG.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (strG.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z5 || i14 >= 3) {
                sb2.append((CharSequence) strG, 0, ((i12 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strG, 0, i14);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final int c(long j10) {
        if (d(j10)) {
            return 0;
        }
        return (int) ((((int) j10) & 1) == 1 ? ((j10 >> 1) % ((long) 1000)) * ((long) 1000000) : (j10 >> 1) % ((long) 1000000000));
    }

    public static final boolean d(long j10) {
        return j10 == f19469d || j10 == f19470e;
    }

    public static final long e(long j10, long j11) {
        if (d(j10)) {
            if (!d(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j11)) {
            return j11;
        }
        int i = ((int) j10) & 1;
        if (i != (((int) j11) & 1)) {
            return i == 1 ? a(j10 >> 1, j11 >> 1) : a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        return i == 0 ? (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? o.s(j12 / ((long) 1000000)) : o.u(j12) : o.t(j12);
    }

    public static final int f(long j10, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) ck.o.c(g(j10, unit), -2147483648L, 2147483647L);
    }

    public static final long g(long j10, d targetUnit) {
        Intrinsics.checkNotNullParameter(targetUnit, "unit");
        if (j10 == f19469d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f19470e) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        d sourceUnit = (((int) j10) & 1) == 0 ? d.f19473c : d.f19474d;
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f19479b.convert(j11, sourceUnit.f19479b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((b) obj).f19471b;
        long j11 = this.f19471b;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i = (((int) j11) & 1) - (((int) j10) & 1);
            return j11 < 0 ? -i : i;
        }
        if (j11 < j10) {
            return -1;
        }
        return j11 == j10 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f19471b == ((b) obj).f19471b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19471b);
    }

    public final String toString() {
        long j10;
        int iG;
        long j11 = this.f19471b;
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f19469d) {
            return "Infinity";
        }
        if (j11 == f19470e) {
            return "-Infinity";
        }
        int i = 0;
        boolean z5 = j11 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z5) {
            sb2.append('-');
        }
        if (j11 < 0) {
            j11 = ((long) (((int) j11) & 1)) + ((-(j11 >> 1)) << 1);
            int i10 = c.f19472a;
        }
        long jG = g(j11, d.f19478h);
        int iG2 = d(j11) ? 0 : (int) (g(j11, d.f19477g) % ((long) 24));
        if (d(j11)) {
            j10 = 0;
            iG = 0;
        } else {
            j10 = 0;
            iG = (int) (g(j11, d.f19476f) % ((long) 60));
        }
        int iG3 = d(j11) ? 0 : (int) (g(j11, d.f19475e) % ((long) 60));
        int iC = c(j11);
        boolean z10 = jG != j10;
        boolean z11 = iG2 != 0;
        boolean z12 = iG != 0;
        boolean z13 = (iG3 == 0 && iC == 0) ? false : true;
        if (z10) {
            sb2.append(jG);
            sb2.append('d');
            i = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(iG2);
            sb2.append('h');
            i = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(iG);
            sb2.append('m');
            i = i12;
        }
        if (z13) {
            int i13 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            if (iG3 != 0 || z10 || z11 || z12) {
                b(sb2, iG3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb2, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb2, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb2.append(iC);
                sb2.append("ns");
            }
            i = i13;
        }
        if (z5 && i > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
