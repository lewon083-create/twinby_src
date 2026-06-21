package com.google.android.gms.internal.ads;

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
public final class jn1 extends h41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f6899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f6900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f6901h;
    public DatagramSocket i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f6902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f6903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6905m;

    public jn1() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f6899f = bArr;
        this.f6900g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws sm1 {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f6905m;
        DatagramPacket datagramPacket = this.f6900g;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.i;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f6905m = length;
                c(length);
            } catch (SocketTimeoutException e3) {
                throw new sm1(e3, 2002);
            } catch (IOException e7) {
                throw new sm1(e7, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f6905m;
        int iMin = Math.min(i12, i10);
        System.arraycopy(this.f6899f, length2 - i12, bArr, i, iMin);
        this.f6905m -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        InetAddress inetAddress;
        this.f6901h = null;
        MulticastSocket multicastSocket = this.f6902j;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f6903k;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f6902j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.f6903k = null;
        this.f6905m = 0;
        if (this.f6904l) {
            this.f6904l = false;
            f();
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws sm1 {
        Uri uri = db1Var.f4544a;
        this.f6901h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f6901h.getPort();
        a(db1Var);
        try {
            this.f6903k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f6903k, port);
            if (this.f6903k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f6902j = multicastSocket;
                multicastSocket.joinGroup(this.f6903k);
                this.i = this.f6902j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(8000);
            this.f6904l = true;
            b(db1Var);
            return -1L;
        } catch (IOException e3) {
            throw new sm1(e3, 2001);
        } catch (SecurityException e7) {
            throw new sm1(e7, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f6901h;
    }
}
