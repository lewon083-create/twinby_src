package l5;

import com.google.android.gms.internal.ads.l6;
import com.google.android.gms.internal.ads.t6;
import io.sentry.TransactionOptions;
import java.math.BigInteger;
import m3.z;
import q4.s;
import q4.t;
import q4.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l6 f27924a;

    public a(l6 l6Var) {
        this.f27924a = l6Var;
    }

    @Override // q4.t
    public final boolean a() {
        return true;
    }

    @Override // q4.t
    public final s e(long j10) {
        l6 l6Var = this.f27924a;
        long j11 = (((long) ((t6) l6Var.f7407m).f10503e) * j10) / 1000000;
        long j12 = l6Var.f7397b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j11);
        long j13 = l6Var.f7398c;
        u uVar = new u(j10, z.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j13 - j12)).divide(BigInteger.valueOf(l6Var.f7400e)).longValue() + j12) - TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, l6Var.f7397b, j13 - 1));
        return new s(uVar, uVar);
    }

    @Override // q4.t
    public final long g() {
        l6 l6Var = this.f27924a;
        return (l6Var.f7400e * 1000000) / ((long) ((t6) l6Var.f7407m).f10503e);
    }
}
