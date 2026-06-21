package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cz extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f4392a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz f4393b;

    public cz(dz dzVar) {
        this.f4393b = dzVar;
    }

    public final void a(Socket socket) throws SocketException {
        dz dzVar = this.f4393b;
        int i = dzVar.f4765s;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        dzVar.f4766t.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f4392a.createSocket(str, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f4392a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f4392a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.f4392a.createSocket(str, i, inetAddress, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f4392a.createSocket(inetAddress, i);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i10) throws IOException {
        Socket socketCreateSocket = this.f4392a.createSocket(inetAddress, i, inetAddress2, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z5) throws IOException {
        Socket socketCreateSocket = this.f4392a.createSocket(socket, str, i, z5);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
