package n4;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f29097a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f29098b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f29099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f29100d;

    public static long a() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f29098b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b10 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i10 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], 123);
                bArr2[b10] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b10);
                    b2 = b10;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j10 = jCurrentTimeMillis / 1000;
                    long j11 = jCurrentTimeMillis - (j10 * 1000);
                    b2 = b10;
                    socketTimeoutException = socketTimeoutException2;
                    long j12 = j10 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j12 >> 24);
                    bArr[41] = (byte) (j12 >> 16);
                    bArr[42] = (byte) (j12 >> 8);
                    bArr[43] = (byte) j12;
                    long j13 = (j11 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j13 >> 24);
                    bArr[45] = (byte) (j13 >> 16);
                    bArr[46] = (byte) (j13 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j14 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b11 = bArr3[b2];
                    int i11 = bArr3[1] & 255;
                    long jD = d(24, bArr3);
                    long jD2 = d(32, bArr3);
                    long jD3 = d(40, bArr3);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i11, jD3);
                    long j15 = (j14 + (((jD3 - j14) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j15;
                } catch (SocketTimeoutException e3) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e3;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e3);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i12 = i10 + 1;
                    if (i10 >= 10) {
                        socketTimeoutException2.getClass();
                        throw socketTimeoutException2;
                    }
                    i++;
                    i10 = i12;
                    b10 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b2, byte b10, int i, long j10) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(o.i(b10, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(o.i(i, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i, byte[] bArr) {
        int i10 = bArr[i];
        int i11 = bArr[i + 1];
        int i12 = bArr[i + 2];
        int i13 = bArr[i + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (((long) i10) << 24) + (((long) i11) << 16) + (((long) i12) << 8) + ((long) i13);
    }

    public static long d(int i, byte[] bArr) {
        long jC = c(i, bArr);
        long jC2 = c(i + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
