package p3;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f31149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f31150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DatagramPacket f31151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Uri f31152u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DatagramSocket f31153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MulticastSocket f31154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InetAddress f31155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31156y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f31157z;

    public g0(int i) {
        super(true);
        this.f31149r = i;
        byte[] bArr = new byte[2000];
        this.f31150s = bArr;
        this.f31151t = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p3.h
    public final void close() {
        this.f31152u = null;
        MulticastSocket multicastSocket = this.f31154w;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f31155x;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f31154w = null;
        }
        DatagramSocket datagramSocket = this.f31153v;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f31153v = null;
        }
        this.f31155x = null;
        this.f31157z = 0;
        if (this.f31156y) {
            this.f31156y = false;
            transferEnded();
        }
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f31152u;
    }

    @Override // p3.h
    public final long open(l lVar) {
        Uri uri = lVar.f31172a;
        this.f31152u = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f31152u.getPort();
        transferInitializing(lVar);
        try {
            this.f31155x = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f31155x, port);
            if (this.f31155x.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f31154w = multicastSocket;
                multicastSocket.joinGroup(this.f31155x);
                this.f31153v = this.f31154w;
            } else {
                this.f31153v = new DatagramSocket(inetSocketAddress);
            }
            this.f31153v.setSoTimeout(this.f31149r);
            this.f31156y = true;
            transferStarted(lVar);
            return -1L;
        } catch (IOException e3) {
            throw new f0(e3, 2001);
        } catch (SecurityException e7) {
            throw new f0(e7, 2006);
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws f0 {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f31157z;
        DatagramPacket datagramPacket = this.f31151t;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f31153v;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f31157z = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e3) {
                throw new f0(e3, 2002);
            } catch (IOException e7) {
                throw new f0(e7, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f31157z;
        int iMin = Math.min(i12, i10);
        System.arraycopy(this.f31150s, length2 - i12, bArr, i, iMin);
        this.f31157z -= iMin;
        return iMin;
    }
}
