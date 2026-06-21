package yads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class da3 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f37677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f37678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f37679h;
    public DatagramSocket i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f37680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f37681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37683m;

    public da3(int i) {
        super(true);
        this.f37676e = 8000;
        byte[] bArr = new byte[2000];
        this.f37677f = bArr;
        this.f37678g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws ca3 {
        Uri uri = u30Var.f43533a;
        this.f37679h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f37679h.getPort();
        e();
        try {
            this.f37681k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f37681k, port);
            if (this.f37681k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f37680j = multicastSocket;
                multicastSocket.joinGroup(this.f37681k);
                this.i = this.f37680j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.f37676e);
            this.f37682l = true;
            b(u30Var);
            return -1L;
        } catch (IOException e3) {
            throw new ca3(e3, 2001);
        } catch (SecurityException e7) {
            throw new ca3(e7, 2006);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f37679h = null;
        MulticastSocket multicastSocket = this.f37680j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f37681k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f37680j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.f37681k = null;
        this.f37683m = 0;
        if (this.f37682l) {
            this.f37682l = false;
            d();
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f37679h;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) throws ca3 {
        if (i10 == 0) {
            return 0;
        }
        if (this.f37683m == 0) {
            try {
                DatagramSocket datagramSocket = this.i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f37678g);
                int length = this.f37678g.getLength();
                this.f37683m = length;
                c(length);
            } catch (SocketTimeoutException e3) {
                throw new ca3(e3, 2002);
            } catch (IOException e7) {
                throw new ca3(e7, 2001);
            }
        }
        int length2 = this.f37678g.getLength();
        int i11 = this.f37683m;
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.f37677f, length2 - i11, bArr, i, iMin);
        this.f37683m -= iMin;
        return iMin;
    }
}
