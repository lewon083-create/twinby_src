package yads;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f36618a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f36619b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f36620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f36621d;

    public static void a(byte b2, byte b10, int i, long j10) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(og2.a("SNTP: Untrusted mode: ", b10));
        }
        if (i == 0 || i > 15) {
            throw new IOException(og2.a("SNTP: Untrusted stratum: ", i));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long b(int i, byte[] bArr) {
        long jA = a(i, bArr);
        long jA2 = a(i + 4, bArr);
        if (jA == 0 && jA2 == 0) {
            return 0L;
        }
        return ((jA2 * 1000) / 4294967296L) + ((jA - 2208988800L) * 1000);
    }

    public static long a(int i, byte[] bArr) {
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

    public static long a() throws UnknownHostException {
        char c8;
        long j10;
        synchronized (f36619b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c8 = 0;
                j10 = jCurrentTimeMillis;
            } else {
                long j11 = jCurrentTimeMillis / 1000;
                long j12 = jCurrentTimeMillis - (j11 * 1000);
                c8 = 0;
                j10 = jCurrentTimeMillis;
                bArr[40] = (byte) (r14 >> 24);
                bArr[41] = (byte) (r14 >> 16);
                bArr[42] = (byte) (r14 >> 8);
                bArr[43] = (byte) (j11 + 2208988800L);
                long j13 = (j12 * 4294967296L) / 1000;
                bArr[44] = (byte) (j13 >> 24);
                bArr[45] = (byte) (j13 >> 16);
                bArr[46] = (byte) (j13 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j14 = (jElapsedRealtime2 - jElapsedRealtime) + j10;
            byte b2 = bArr[c8];
            int i = bArr[1] & 255;
            long jB = b(24, bArr);
            long jB2 = b(32, bArr);
            long jB3 = b(40, bArr);
            a((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, jB3);
            long j15 = (j14 + (((jB3 - j14) + (jB2 - jB)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j15;
        } finally {
        }
    }
}
