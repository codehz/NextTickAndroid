package codehz.nexttick.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.Date;

import codehz.nexttick.BR;

public class CardData extends BaseObservable {
    private String title;
    private Date startTime;
    private Date endTime;
    private String position;
    private String description;

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
        notifyPropertyChanged(BR.startTime);
    }

    @Bindable
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
        notifyPropertyChanged(BR.endTime);
    }

    @Bindable
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
        notifyPropertyChanged(BR.endTime);
    }

    @Bindable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyPropertyChanged(BR.description);
    }

    public static class VoidCard extends CardData {
        @Override
        public String getTitle() {
            return "title";
        }

        @Override
        public String getDescription() {
            return "description";
        }
    }
}
