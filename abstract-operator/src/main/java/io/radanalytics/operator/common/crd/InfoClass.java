package io.radanalytics.operator.common.crd;

import io.fabric8.kubernetes.client.CustomResource;

//TODO: I think this class is no longer necessary in fabric8 5.x
public class InfoClass<U> extends CustomResource {
    private U spec;
    private InfoStatus status;

    public InfoClass() {
        this.status = new InfoStatus();
    }

    public InfoStatus getStatus() {
        return this.status;
    }

    public void setStatus(InfoStatus status) {
        this.status = status;
    }
}
